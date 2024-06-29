import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class494 extends class15 {
   @OriginalMember(
      owner = "client!go",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6899 = new String[]{method3762(method3761("\u000b@Vl\u0002")), method3762(method3761("\u0017\u0001V\u0000W")), method3762(method3761("\u0002Z\u0014B")), method3762(method3761("\u000b@Vh\u0002")), method3762(method3761("\u000b@Vj\u0002")), method3762(method3761("\u000b@Vm\u0002")), method3762(method3761("\u000b@Vo\u0002")), method3762(method3761("\u000b@Vk\u0002")), method3762(method3761("\u000b@Vi\u0002"))};
   @OriginalMember(
      owner = "client!go",
      name = "y",
      descriptor = "Lcfa;"
   )
   public static class187 field6892 = new class187();
   @OriginalMember(
      owner = "client!go",
      name = "t",
      descriptor = "I"
   )
   public static int field6889;
   @OriginalMember(
      owner = "client!go",
      name = "x",
      descriptor = "I"
   )
   public static int field6890;
   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "I"
   )
   public static int field6893;
   @OriginalMember(
      owner = "client!go",
      name = "s",
      descriptor = "I"
   )
   public static int field6894;
   @OriginalMember(
      owner = "client!go",
      name = "w",
      descriptor = "I"
   )
   public static int field6895;
   @OriginalMember(
      owner = "client!go",
      name = "A",
      descriptor = "I"
   )
   public static int field6897;
   @OriginalMember(
      owner = "client!go",
      name = "B",
      descriptor = "I"
   )
   public static int field6898;
   @OriginalMember(
      owner = "client!go",
      name = "v",
      descriptor = "Lhv;"
   )
   private class227 field6891;
   @OriginalMember(
      owner = "client!go",
      name = "u",
      descriptor = "Lww;"
   )
   public static class339 field6896;

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3754(byte arg0) {
      try {
         field6892 = null;
         if (arg0 > 2) {
            field6896 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6899[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3755(int arg0, int arg1) {
      try {
         label16: {
            if (~class533.field7825 == arg0) {
               class98.field1305.method5157(arg1, (byte)107);
               if (!client.field1481) {
                  break label16;
               }
            }

            class624.field9229 = arg1;
         }

         ++field6894;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6899[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method3756(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         ++field6890;

         while(true) {
            int var4 = arg1.method640(arg0 ^ 7109);
            if (~var4 != -1) {
               this.method3760(1, var4, arg1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 != 6970) {
               field6898 = 95;
               return;
            }
            break;
         }

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6899[0] + arg0 + ',' + (arg1 != null ? field6899[1] : field6899[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(IIZ)I"
   )
   public final int method3757(int arg0, int arg1, boolean arg2) {
      try {
         ++field6889;
         if (this.field6891 == null) {
            return arg1;
         } else {
            class278 var4 = (class278)this.field6891.method1818(-1, (long)arg0);
            if (var4 == null) {
               return arg1;
            } else {
               return arg2 ? -12 : var4.field3546;
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6899[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(BI[F)[F"
   )
   public static final float[] method3758(byte arg0, int arg1, float[] arg2) {
      try {
         ++field6893;
         float[] var3 = new float[arg1];
         class349.method2763(arg2, 0, var3, 0, arg1);
         if (arg0 != 101) {
            method3755(125, -90);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6899[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6899[1] : field6899[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(IILjava/lang/String;)Ljava/lang/String;"
   )
   public final String method3759(int arg0, int arg1, String arg2) {
      try {
         ++field6897;
         if (this.field6891 == null) {
            return arg2;
         } else {
            class217 var4 = (class217)this.field6891.method1818(arg1, (long)arg0);
            return var4 == null ? arg2 : var4.field2751;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6899[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6899[1] : field6899[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(IILgea;)V"
   )
   private final void method3760(int arg0, int arg1, class66 arg2) {
      boolean var4 = client.field1481;

      try {
         if (arg1 == 249) {
            int var5 = arg2.method640(255);
            if (this.field6891 == null) {
               int var6 = class109.method978(-1, var5);
               this.field6891 = new class227(var6);
            }

            int var7 = 0;
            if (var4 || var5 > var7) {
               do {
                  int var9;
                  class673 var10;
                  label47: {
                     boolean var8 = arg2.method640(arg0 ^ 254) == 1;
                     var9 = arg2.method645((byte)-26);
                     if (var8) {
                        var10 = new class217(arg2.method606(arg0 ^ 11857));
                        if (!var4) {
                           break label47;
                        }
                     }

                     var10 = new class278(arg2.method610(-89));
                  }

                  this.field6891.method1808((long)var9, var10, 26459);
                  ++var7;
               } while(var5 > var7);
            }
         }

         if (arg0 != 1) {
            this.method3760(0, 9, (class66)null);
         }

         ++field6895;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field6899[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6899[1] : field6899[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3761(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3762(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
