import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sja")
public class class11 extends class551 {
   @OriginalMember(
      owner = "client!sja",
      name = "t",
      descriptor = "I"
   )
   private int field152 = 0;
   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field154 = new String[]{method94(method93("\u0011%Q+ZJ")), method94(method93("\u0011%Q+YJ")), method94(method93("\u0011%Q+[J")), method94(method93("\f:\\i")), method94(method93("\u0019a\u001e+e"))};
   @OriginalMember(
      owner = "client!sja",
      name = "q",
      descriptor = "Lsd;"
   )
   public static class101 field151 = new class101(123, -1);
   @OriginalMember(
      owner = "client!sja",
      name = "p",
      descriptor = "I"
   )
   public static int field149;
   @OriginalMember(
      owner = "client!sja",
      name = "r",
      descriptor = "I"
   )
   public static int field150;
   @OriginalMember(
      owner = "client!sja",
      name = "s",
      descriptor = "I"
   )
   public static int field153;

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method90(boolean arg0, int arg1) {
      try {
         ++field149;
         int var3 = super.field8160.field6837.method4343(108, class189.field2365, super.field8151.method1971()) - -super.field8160.field6842;
         int var4 = 42 / ((-91 - arg1) / 35);
         int var5 = super.field8160.field6833.method2922(class663.field9630, 119, super.field8151.method1975()) + super.field8160.field6834;
         super.field8151.method3029((float)(super.field8151.method1971() / 2 + var3), (float)(super.field8151.method1975() / 2 + var5), 4096, this.field152);
         this.field152 += ((class709)super.field8160).field10586;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field154[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "<init>",
      descriptor = "(Leaa;Lqf;)V"
   )
   public class11(class526 arg0, class709 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!sja",
      name = "a",
      descriptor = "(Lhv;IBIZ)V"
   )
   public static final void method91(class544 arg0, int arg1, byte arg2, int arg3, boolean arg4) {
      int var5 = client.field4530;

      try {
         if (arg2 > -112) {
            field151 = null;
         }

         int var6;
         label116: {
            ++field153;
            var6 = arg0.field7986;
            if (~arg0.field7959 != -1) {
               if (~arg0.field7959 == -2) {
                  arg0.field7986 = -arg0.field7915 + arg3;
                  if (var5 == 0) {
                     break label116;
                  }
               }

               if (~arg0.field7959 != -3) {
                  break label116;
               }

               arg0.field7986 = arg0.field7915 * arg3 >> 14;
               if (var5 == 0) {
                  break label116;
               }
            }

            arg0.field7986 = arg0.field7915;
         }

         int var7;
         label123: {
            var7 = arg0.field7954;
            if (~arg0.field7956 == -1) {
               arg0.field7954 = arg0.field8078;
               if (var5 == 0) {
                  break label123;
               }
            }

            if (~arg0.field7956 == -2) {
               arg0.field7954 = arg1 - arg0.field8078;
               if (var5 == 0) {
                  break label123;
               }
            }

            if (~arg0.field7956 == -3) {
               arg0.field7954 = arg0.field8078 * arg1 >> 14;
            }
         }

         if (arg0.field7959 == 4) {
            arg0.field7986 = arg0.field8023 * arg0.field7954 / arg0.field7993;
         }

         if (arg0.field7956 == 4) {
            arg0.field7954 = arg0.field7993 * arg0.field7986 / arg0.field8023;
         }

         if (class384.field5876 && (~client.method2388(arg0).field7097 != -1 || ~arg0.field7920 == -1)) {
            label129: {
               if (arg0.field7954 < 5 && ~arg0.field7986 > -6) {
                  arg0.field7986 = 5;
                  arg0.field7954 = 5;
                  if (var5 == 0) {
                     break label129;
                  }
               }

               if (~arg0.field7954 >= -1) {
                  arg0.field7954 = 5;
               }

               if (arg0.field7986 <= 0) {
                  arg0.field7986 = 5;
               }
            }
         }

         if (class365.field5471 == arg0.field7994) {
            class715.field10655 = arg0;
         }

         if (arg4 && arg0.field7947 != null) {
            if (arg0.field7986 != var6 || arg0.field7954 != var7) {
               class662 var8 = new class662();
               var8.field9589 = arg0;
               var8.field9595 = arg0.field7947;
               class676.field10177.method4060(23, var8);
            }

         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field154[2] + (arg0 != null ? field154[4] : field154[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method92(int arg0) {
      try {
         field151 = null;
         if (arg0 >= -53) {
            method91((class544)null, -91, (byte)-116, 106, true);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field154[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method93(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method94(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
