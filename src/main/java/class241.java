import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class241 extends class546 {
   @OriginalMember(
      owner = "client!ui",
      name = "I",
      descriptor = "J"
   )
   public long field3010;
   @OriginalMember(
      owner = "client!ui",
      name = "D",
      descriptor = "Z"
   )
   public boolean field3009;
   @OriginalMember(
      owner = "client!ui",
      name = "M",
      descriptor = "Z"
   )
   public boolean field3005;
   @OriginalMember(
      owner = "client!ui",
      name = "G",
      descriptor = "I"
   )
   public int field2992;
   @OriginalMember(
      owner = "client!ui",
      name = "F",
      descriptor = "I"
   )
   public int field2993;
   @OriginalMember(
      owner = "client!ui",
      name = "K",
      descriptor = "I"
   )
   public int field2996;
   @OriginalMember(
      owner = "client!ui",
      name = "E",
      descriptor = "Ljava/lang/String;"
   )
   public String field3011;
   @OriginalMember(
      owner = "client!ui",
      name = "B",
      descriptor = "I"
   )
   public int field3002;
   @OriginalMember(
      owner = "client!ui",
      name = "L",
      descriptor = "Ljava/lang/String;"
   )
   public String field3007;
   @OriginalMember(
      owner = "client!ui",
      name = "t",
      descriptor = "J"
   )
   public long field3003;
   @OriginalMember(
      owner = "client!ui",
      name = "u",
      descriptor = "I"
   )
   public int field3004;
   @OriginalMember(
      owner = "client!ui",
      name = "w",
      descriptor = "Z"
   )
   public boolean field2994;
   @OriginalMember(
      owner = "client!ui",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3012 = new String[]{method1808(method1807("qZn7\b")), method1808(method1807("d\u0001,u")), method1808(method1807("\u007f\u001dn[]")), method1808(method1807("\u007f\u001dn]]")), method1808(method1807("O;\u0006")), method1808(method1807("\u007f\u001dn%\u001cd\u001d4']")), method1808(method1807("\u007f\u001dnZ]")), method1808(method1807("\u007f\u001dnX]"))};
   @OriginalMember(
      owner = "client!ui",
      name = "C",
      descriptor = "I"
   )
   public static int field2997;
   @OriginalMember(
      owner = "client!ui",
      name = "y",
      descriptor = "I"
   )
   public static int field3006;
   @OriginalMember(
      owner = "client!ui",
      name = "A",
      descriptor = "I"
   )
   public static int field3008;
   @OriginalMember(
      owner = "client!ui",
      name = "x",
      descriptor = "J"
   )
   public static long field2998;
   @OriginalMember(
      owner = "client!ui",
      name = "H",
      descriptor = "J"
   )
   public static long field2999;
   @OriginalMember(
      owner = "client!ui",
      name = "J",
      descriptor = "J"
   )
   public static long field3001;
   @OriginalMember(
      owner = "client!ui",
      name = "v",
      descriptor = "Lbo;"
   )
   public static class763 field2995;
   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   public String field3000;

   @OriginalMember(
      owner = "client!ui",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method1803(boolean arg0) {
      try {
         if (arg0) {
            method1804((byte)-68, 66, 92);
         }

         field2995 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3012[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(BII)Z"
   )
   public static final boolean method1804(byte arg0, int arg1, int arg2) {
      try {
         ++field3008;
         if (arg0 != -53) {
            return false;
         } else {
            return class658.method4779(115, arg1, arg2) | ~(393216 & arg2) != -1 || class576.method4142(arg1, 1, arg2);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3012[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1805(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field2997;
         class468 var2 = null;

         try {
            if (arg0 != -1) {
               field3001 = 10L;
            }

            class289 var3 = class61.field671.method1946("2", true, (byte)-78);
            if (var1) {
               class173.method1347(-113, 1L);
            }

            while(true) {
               int var10000;
               if (var3.field3826 != 0) {
                  var10000 = ~var3.field3826;
                  if (!var1) {
                     if (var10000 == -2) {
                        var2 = (class468)var3.field3830;
                        byte[] var4 = new byte[(int)var2.method3429(137)];
                        int var5 = 0;
                        if (var1 || ~var5 > ~var4.length) {
                           do {
                              int var6 = var2.method3434((byte)-83, var4.length + -var5, var5, var4);
                              if (var6 == -1) {
                                 throw new IOException(field3012[4]);
                              }

                              var5 += var6;
                           } while(~var5 > ~var4.length);
                        }

                        class442.method3283(new class594(var4), (byte)-114);
                     }
                     break;
                  }
               } else {
                  var10000 = -113;
               }

               class173.method1347(var10000, 1L);
            }
         } catch (Exception var9) {
         }

         try {
            if (var2 != null) {
               var2.method3435(false);
            }
         } catch (Exception var8) {
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field3012[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "a",
      descriptor = "(ILwm;)Lvm;"
   )
   public static final class717 method1806(int arg0, class594 arg1) {
      try {
         if (arg0 >= -118) {
            field2995 = null;
         }

         ++field3006;
         class717 var2 = new class717();
         var2.field10508 = arg1.method4280(-19104);
         var2.field10506 = class28.field352.method5495(var2.field10508, false);
         return var2;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3012[2] + arg0 + ',' + (arg1 != null ? field3012[0] : field3012[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V"
   )
   public class241(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
      try {
         this.field3010 = arg5;
         this.field3009 = arg11;
         this.field3005 = arg8;
         this.field2992 = arg7;
         this.field2993 = arg3;
         this.field2996 = arg2;
         this.field3011 = arg1;
         this.field3002 = arg6;
         this.field3007 = arg0;
         this.field3003 = arg10;
         this.field3004 = arg4;
         this.field2994 = arg9;
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field3012[5] + (arg0 != null ? field3012[0] : field3012[1]) + ',' + (arg1 != null ? field3012[0] : field3012[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1807(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ui",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1808(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
