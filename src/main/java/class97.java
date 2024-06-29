import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class97 extends class213 {
   @OriginalMember(
      owner = "client!eha",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1276 = new String[]{method903(method902("\u001a\u0000^3aW")), method903(method902("\u0004F\u00113X")), method903(method902("\u0011\u001dSq")), method903(method902("\u001a\u0000^3fW")), method903(method902("\u001a\u0000^3gW")), method903(method902("\u001a\u0000^3dW"))};
   @OriginalMember(
      owner = "client!eha",
      name = "F",
      descriptor = "[[I"
   )
   public static int[][] field1273 = new int[128][128];
   @OriginalMember(
      owner = "client!eha",
      name = "H",
      descriptor = "I"
   )
   public static int field1271;
   @OriginalMember(
      owner = "client!eha",
      name = "G",
      descriptor = "I"
   )
   public static int field1274;
   @OriginalMember(
      owner = "client!eha",
      name = "E",
      descriptor = "I"
   )
   public static int field1275;
   @OriginalMember(
      owner = "client!eha",
      name = "D",
      descriptor = "Lq;"
   )
   public static class454 field1272;

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method899(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         int var6;
         if (~arg2 >= ~arg3) {
            var6 = arg2;
            if (var5) {
               class17.field236[arg2][arg0] = arg1;
               var6 = arg2 + 1;
            }

            while(true) {
               while(arg3 > var6) {
                  class17.field236[var6][arg0] = arg1;
                  ++var6;
               }

               if (!var5) {
                  if (var5) {
                     var6 = arg3;
                     if (var5) {
                        class17.field236[arg3][arg0] = arg1;
                        var6 = arg3 + 1;
                     }
                  } else {
                     if (!var5) {
                        if (arg4 <= 27) {
                           method900((byte)-56);
                        }

                        ++field1271;
                        return;
                     }

                     ++var6;
                  }
                  break;
               }

               ++var6;
            }
         } else {
            var6 = arg3;
            if (var5) {
               class17.field236[arg3][arg0] = arg1;
               var6 = arg3 + 1;
            }
         }

         while(true) {
            while(~var6 > ~arg2) {
               class17.field236[var6][arg0] = arg1;
               ++var6;
            }

            if (!var5) {
               if (arg4 <= 27) {
                  method900((byte)-56);
               }

               ++field1271;
               return;
            }

            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1276[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method900(byte arg0) {
      try {
         field1273 = null;
         field1272 = null;
         if (arg0 <= 6) {
            method900((byte)-103);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1276[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "<init>",
      descriptor = "()V"
   )
   public class97() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      try {
         ++field1274;
         if (arg1 != 2064866508) {
            field1272 = null;
         }

         return class534.field7301;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1276[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(Ljava/lang/String;BZILjava/lang/String;)V"
   )
   public static final void method901(String arg0, byte arg1, boolean arg2, int arg3, String arg4) {
      try {
         ++field1275;
         class471 var5 = class311.method2331(-58);
         var5.field6527.method4318(class553.field7614.field3850, 0);
         var5.field6527.method4284(0, -31429);
         int var6 = var5.field6527.field8243;
         var5.field6527.method4284(654, -31429);
         int[] var7 = class31.method254(4, var5);
         int var8 = var5.field6527.field8243;
         var5.field6527.method4332((byte)-84, arg4);
         var5.field6527.method4284(class74.field924, -31429);
         var5.field6527.method4332((byte)-119, arg0);
         if (arg1 <= 2) {
            field1273 = null;
         }

         var5.field6527.method4307(85, class55.field594);
         var5.field6527.method4318(class494.field6787, 0);
         var5.field6527.method4318(class381.field5334.field333, 0);
         class328.method2611(var5.field6527, (byte)-36);
         String var9 = class489.field6742;
         var5.field6527.method4318(var9 != null ? 1 : 0, 0);
         if (var9 != null) {
            var5.field6527.method4332((byte)-125, var9);
         }

         var5.field6527.method4318(arg3, 0);
         var5.field6527.method4318(!arg2 ? 0 : 1, 0);
         var5.field6527.field8243 += 7;
         var5.field6527.method4329(var5.field6527.field8243, -12467, var7, var8);
         var5.field6527.method4313(56136136, -var6 + var5.field6527.field8243);
         class605.field8473.method1702((byte)-92, var5);
         class291.field3840 = 0;
         class546.field7447 = 0;
         class617.field8606 = 1;
         class489.field6746 = -3;
         if (~arg3 > -14) {
            class483.field6657 = true;
            class645.method4651(-11745);
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field1276[3] + (arg0 != null ? field1276[1] : field1276[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1276[1] : field1276[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method902(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method903(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
