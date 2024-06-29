import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class541 extends class15 {
   @OriginalMember(
      owner = "client!wf",
      name = "J",
      descriptor = "J"
   )
   public long field7912;
   @OriginalMember(
      owner = "client!wf",
      name = "t",
      descriptor = "I"
   )
   public int field7914;
   @OriginalMember(
      owner = "client!wf",
      name = "u",
      descriptor = "Z"
   )
   public boolean field7915;
   @OriginalMember(
      owner = "client!wf",
      name = "F",
      descriptor = "I"
   )
   public int field7911;
   @OriginalMember(
      owner = "client!wf",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   public String field7905;
   @OriginalMember(
      owner = "client!wf",
      name = "s",
      descriptor = "I"
   )
   public int field7909;
   @OriginalMember(
      owner = "client!wf",
      name = "K",
      descriptor = "Z"
   )
   public boolean field7906;
   @OriginalMember(
      owner = "client!wf",
      name = "G",
      descriptor = "Ljava/lang/String;"
   )
   public String field7903;
   @OriginalMember(
      owner = "client!wf",
      name = "C",
      descriptor = "J"
   )
   public long field7901;
   @OriginalMember(
      owner = "client!wf",
      name = "y",
      descriptor = "I"
   )
   public int field7913;
   @OriginalMember(
      owner = "client!wf",
      name = "B",
      descriptor = "Z"
   )
   public boolean field7904;
   @OriginalMember(
      owner = "client!wf",
      name = "w",
      descriptor = "I"
   )
   public int field7908;
   @OriginalMember(
      owner = "client!wf",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7918 = new String[]{method4096(method4095("v0*7_")), method4096(method4095("o#h\u0018")), method4096(method4095("zx*Z\n")), method4096(method4095("v0*H\u001eo?pJ_")), method4096(method4095("v0*5_")), method4096(method4095("v0*6_"))};
   @OriginalMember(
      owner = "client!wf",
      name = "H",
      descriptor = "Lsia;"
   )
   public static class407 field7902 = new class407(64);
   @OriginalMember(
      owner = "client!wf",
      name = "D",
      descriptor = "I"
   )
   public static int field7907;
   @OriginalMember(
      owner = "client!wf",
      name = "I",
      descriptor = "I"
   )
   public static int field7910;
   @OriginalMember(
      owner = "client!wf",
      name = "E",
      descriptor = "I"
   )
   public static int field7916;
   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   public String field7900;
   @OriginalMember(
      owner = "client!wf",
      name = "x",
      descriptor = "[Lhg;"
   )
   public static class529[] field7917;

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public static final void method4092(int arg0, class66 arg1) {
      boolean var2 = client.field1481;

      try {
         ++field7907;
         byte[] var3 = new byte[24];
         if (arg0 != -1) {
            method4094(false);
         }

         if (class532.field7811 != null) {
            try {
               int var10000;
               byte var10001;
               label85: {
                  class532.field7811.method4049(0L, -1);
                  class532.field7811.method4047(var3, arg0 + 1);
                  int var4 = 0;
                  if (var2) {
                     var10000 = ~var3[var4];
                     var10001 = -1;
                  } else if (var4 >= 24) {
                     var10000 = var4;
                     var10001 = 24;
                     if (!var2) {
                        break label85;
                     }
                  } else {
                     var10000 = ~var3[var4];
                     var10001 = -1;
                  }

                  label84:
                  do {
                     while(true) {
                        if (var10000 != var10001) {
                           if (!var2) {
                              var10000 = var4;
                              var10001 = 24;
                              break;
                           }

                           ++var4;
                        } else {
                           ++var4;
                        }

                        if (var4 >= 24) {
                           var10000 = var4;
                           var10001 = 24;
                           if (!var2) {
                              break label84;
                           }
                        } else {
                           var10000 = ~var3[var4];
                           var10001 = -1;
                        }
                     }
                  } while(var2);
               }

               if (var10000 >= var10001) {
                  throw new IOException();
               }
            } catch (Exception var7) {
               int var5 = 0;
               if (var2) {
                  var3[var5] = -1;
                  ++var5;
               }

               while(true) {
                  while(var5 < 24) {
                     var3[var5] = -1;
                     ++var5;
                  }

                  if (!var2) {
                     break;
                  }

                  ++var5;
               }
            }
         }

         arg1.method601(arg0 + 86, 24, 0, var3);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field7918[5] + arg0 + ',' + (arg1 != null ? field7918[2] : field7918[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4093(int arg0) {
      try {
         field7902 = null;
         field7917 = null;
         if (arg0 < 88) {
            field7917 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7918[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4094(boolean arg0) {
      try {
         ++field7910;
         if (!arg0) {
            field7902 = null;
         }

         if (~class345.field4731 > -1) {
            class227.field2847 = -1;
            class491.field6864 = -1;
            class345.field4731 = 0;
         }

         if (~class326.field4492 > ~class345.field4731) {
            class491.field6864 = -1;
            class345.field4731 = class326.field4492;
            class227.field2847 = -1;
         }

         if (~class381.field5303 > -1) {
            class381.field5303 = 0;
            class491.field6864 = -1;
            class227.field2847 = -1;
         }

         if (class381.field5303 > class326.field4486) {
            class227.field2847 = -1;
            class491.field6864 = -1;
            class381.field5303 = class326.field4486;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7918[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V"
   )
   public class541(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
      try {
         this.field7912 = arg5;
         this.field7914 = arg6;
         this.field7915 = arg11;
         this.field7911 = arg2;
         this.field7905 = arg0;
         this.field7909 = arg3;
         this.field7906 = arg9;
         this.field7903 = arg1;
         this.field7901 = arg10;
         this.field7913 = arg4;
         this.field7904 = arg8;
         this.field7908 = arg7;
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field7918[3] + (arg0 != null ? field7918[2] : field7918[1]) + ',' + (arg1 != null ? field7918[2] : field7918[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4095(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4096(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
