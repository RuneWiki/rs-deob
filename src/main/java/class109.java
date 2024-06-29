import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class109 {
   @OriginalMember(
      owner = "client!hk",
      name = "p",
      descriptor = "I"
   )
   public int field1320 = 128;
   @OriginalMember(
      owner = "client!hk",
      name = "r",
      descriptor = "I"
   )
   public int field1325 = 128;
   @OriginalMember(
      owner = "client!hk",
      name = "q",
      descriptor = "I"
   )
   public int field1328;
   @OriginalMember(
      owner = "client!hk",
      name = "e",
      descriptor = "I"
   )
   public int field1324;
   @OriginalMember(
      owner = "client!hk",
      name = "g",
      descriptor = "I"
   )
   public int field1334;
   @OriginalMember(
      owner = "client!hk",
      name = "s",
      descriptor = "I"
   )
   public int field1335;
   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1340 = new String[]{method941(method940("El\u0001Q!Cn[S`")), method941(method940("El\u0001)`")), method941(method940("El\u0001.`")), method941(method940("El\u0001/`")), method941(method940("El\u0001+`")), method941(method940("El\u0001(`")), method941(method940("El\u0001,`")), method941(method940("V)\u0001C5")), method941(method940("CrC\u0001"))};
   @OriginalMember(
      owner = "client!hk",
      name = "m",
      descriptor = "Lcj;"
   )
   public static class721 field1321 = new class721(7, 0, 1, 1);
   @OriginalMember(
      owner = "client!hk",
      name = "t",
      descriptor = "I"
   )
   public static int field1331 = -1;
   @OriginalMember(
      owner = "client!hk",
      name = "d",
      descriptor = "I"
   )
   public static int field1338 = 0;
   @OriginalMember(
      owner = "client!hk",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field1337 = new byte[250][];
   @OriginalMember(
      owner = "client!hk",
      name = "u",
      descriptor = "I"
   )
   public int field1319;
   @OriginalMember(
      owner = "client!hk",
      name = "o",
      descriptor = "I"
   )
   public static int field1322;
   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "I"
   )
   public int field1323;
   @OriginalMember(
      owner = "client!hk",
      name = "i",
      descriptor = "I"
   )
   public int field1326;
   @OriginalMember(
      owner = "client!hk",
      name = "f",
      descriptor = "I"
   )
   public static int field1327;
   @OriginalMember(
      owner = "client!hk",
      name = "l",
      descriptor = "I"
   )
   public int field1329;
   @OriginalMember(
      owner = "client!hk",
      name = "c",
      descriptor = "I"
   )
   public int field1330;
   @OriginalMember(
      owner = "client!hk",
      name = "j",
      descriptor = "I"
   )
   public static int field1332;
   @OriginalMember(
      owner = "client!hk",
      name = "n",
      descriptor = "I"
   )
   public static int field1333;
   @OriginalMember(
      owner = "client!hk",
      name = "h",
      descriptor = "I"
   )
   public static int field1336;
   @OriginalMember(
      owner = "client!hk",
      name = "k",
      descriptor = "I"
   )
   public static int field1339;

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(ILhk;)V"
   )
   public final void method934(int arg0, class109 arg1) {
      try {
         ++field1322;
         this.field1324 = arg1.field1324;
         this.field1320 = arg1.field1320;
         this.field1334 = arg1.field1334;
         this.field1335 = arg1.field1335;
         this.field1328 = arg1.field1328;
         if (arg0 <= 9) {
            this.method938(-122);
         }

         this.field1325 = arg1.field1325;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1340[6] + arg0 + ',' + (arg1 != null ? field1340[7] : field1340[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method935(byte arg0) {
      int var1 = client.field4530;

      try {
         label43: {
            if (class672.field10112 == 9) {
               class317.method2411(5, (byte)116);
               if (var1 == 0) {
                  break label43;
               }
            }

            if (class672.field10112 == 5 || ~class672.field10112 == -7) {
               class317.method2411(3, (byte)-113);
               if (var1 == 0) {
                  break label43;
               }
            }

            if (~class672.field10112 == -13) {
               class317.method2411(3, (byte)94);
            }
         }

         ++field1333;
         if (arg0 != 0) {
            method939(91);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1340[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public static final void method936(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         int var6 = class261.field3566.field9434.method1271(119) * arg2 >> 8;
         if (!arg3) {
            field1338 = -57;
         }

         label43: {
            ++field1339;
            if (arg1 == -1 && !class107.field1306) {
               class637.method4586(-123);
               if (client.field4530 == 0) {
                  break label43;
               }
            }

            if (~arg1 != 0 && (~class56.field705 != ~arg1 || !class152.method1249(-7966)) && ~var6 != -1 && !class107.field1306) {
               class150.method1235(var6, 17, false, arg0, class382.field5861, 0, arg1);
               class454.method3417((byte)-65);
            }
         }

         if (~class56.field705 != ~arg1) {
            class773.field11317 = null;
         }

         class56.field705 = arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1340[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "b",
      descriptor = "(B)J"
   )
   public static final long method937(byte arg0) {
      try {
         if (arg0 != 43) {
            field1331 = 13;
         }

         ++field1327;
         return class401.field6167.method1110((byte)109);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1340[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "b",
      descriptor = "(I)Lhk;"
   )
   public final class109 method938(int arg0) {
      try {
         ++field1332;
         return arg0 != -1 ? null : new class109(this.field1328, this.field1325, this.field1320, this.field1334, this.field1324, this.field1335);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1340[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method939(int arg0) {
      try {
         int var1 = 7 % ((74 - arg0) / 34);
         field1321 = null;
         field1337 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1340[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class109(int arg0) {
      try {
         this.field1328 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1340[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field1320 = arg2;
         this.field1324 = arg4;
         this.field1334 = arg3;
         this.field1325 = arg1;
         this.field1328 = arg0;
         this.field1335 = arg5;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1340[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method940(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method941(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
