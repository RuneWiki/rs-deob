import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class173 {
   @OriginalMember(
      owner = "client!pga",
      name = "f",
      descriptor = "I"
   )
   private int field2243 = 0;
   @OriginalMember(
      owner = "client!pga",
      name = "g",
      descriptor = "Lhv;"
   )
   private class227 field2242;
   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2246 = new String[]{method1489(method1488("X6q\u001e\u000b\u0000")), method1489(method1488("X6q\u001e\r\u0000")), method1489(method1488("X6q\u001e\f\u0000")), method1489(method1488("X6q\u001e\n\u0000")), method1489(method1488("S\u007f>\u001e4")), method1489(method1488("F$|\\")), method1489(method1488("X6q\u001euA?yDw\u0000")), method1489(method1488("X6q\u001e\b\u0000"))};
   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "I"
   )
   public static int field2238 = 0;
   @OriginalMember(
      owner = "client!pga",
      name = "d",
      descriptor = "I"
   )
   public static int field2237;
   @OriginalMember(
      owner = "client!pga",
      name = "b",
      descriptor = "I"
   )
   public static int field2239;
   @OriginalMember(
      owner = "client!pga",
      name = "i",
      descriptor = "I"
   )
   public static int field2240;
   @OriginalMember(
      owner = "client!pga",
      name = "h",
      descriptor = "I"
   )
   public static int field2241;
   @OriginalMember(
      owner = "client!pga",
      name = "e",
      descriptor = "I"
   )
   public static int field2245;
   @OriginalMember(
      owner = "client!pga",
      name = "c",
      descriptor = "Lcm;"
   )
   private class673 field2244;

   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "(B)Lcm;"
   )
   public final class673 method1483(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field2240;
         if (arg0 != -53) {
            this.method1485(35);
         }

         if (this.field2243 > 0 && this.field2242.field2835[this.field2243 + -1] != this.field2244) {
            class673 var3 = this.field2244;
            this.field2244 = var3.field9972;
            return var3;
         } else {
            while(~this.field2243 > ~this.field2242.field2839) {
               class673 var4 = this.field2242.field2835[this.field2243++].field9972;
               class673 var10000 = var4;

               while(var10000 != this.field2242.field2835[this.field2243 + -1]) {
                  this.field2244 = var4.field9972;
                  var10000 = var4;
                  if (!var2) {
                     return var4;
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2246[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method1484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field1481;

      try {
         ++field2241;
         int var9 = class180.method1522(arg4 + 25431, class577.field8561, class586.field8647, arg2);
         int var10 = class180.method1522(25495, class577.field8561, class586.field8647, arg6);
         int var11 = class180.method1522(arg4 ^ 25559, class415.field5689, class282.field3921, arg7);
         int var12 = class180.method1522(25495, class415.field5689, class282.field3921, arg1);
         int var13 = class180.method1522(25495, class577.field8561, class586.field8647, arg2 + arg5);
         int var14 = class180.method1522(25495, class577.field8561, class586.field8647, -arg5 + arg6);
         int var15 = var9;
         if (arg4 != 64) {
            field2238 = 49;
            if (var8) {
               class385.method3045(arg3, var12, class237.field3001[var9], var11, (byte)-81);
               var15 = var9 + 1;
            }
         }

         while(true) {
            while(var13 > var15) {
               class385.method3045(arg3, var12, class237.field3001[var15], var11, (byte)-81);
               ++var15;
            }

            int var16 = var10;
            if (!var8) {
               if (var8) {
                  class385.method3045(arg3, var12, class237.field3001[var10], var11, (byte)-71);
                  var16 = var10 - 1;
               }

               while(true) {
                  while(~var14 > ~var16) {
                     class385.method3045(arg3, var12, class237.field3001[var16], var11, (byte)-71);
                     --var16;
                  }

                  int var17 = class180.method1522(arg4 + 25431, class415.field5689, class282.field3921, arg5 + arg7);
                  int var18 = class180.method1522(arg4 ^ 25559, class415.field5689, class282.field3921, -arg5 + arg1);
                  int var19 = var13;
                  if (!var8) {
                     if (!var8 && var14 < var13) {
                        return;
                     }

                     do {
                        int[] var20 = class237.field3001[var19];
                        class385.method3045(arg3, var17, var20, var11, (byte)-103);
                        class385.method3045(arg0, var18, var20, var17, (byte)-78);
                        class385.method3045(arg3, var12, var20, var18, (byte)-81);
                        ++var19;
                     } while(var14 >= var19);

                     return;
                  }

                  --var16;
               }
            }

            ++var15;
         }
      } catch (RuntimeException var22) {
         throw class93.method866(var22, field2246[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "(I)Lcm;"
   )
   public final class673 method1485(int arg0) {
      try {
         ++field2239;
         this.field2243 = arg0;
         return this.method1483((byte)-53);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2246[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1486(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "(Lhe;B[[B)V"
   )
   public static final void method1487(class621 arg0, byte arg1, byte[][] arg2) {
      boolean var3 = client.field1481;

      try {
         ++field2245;
         if (arg1 < -11) {
            int var4 = class772.field11242.length;
            int var5 = 0;
            if (var3 || var5 < var4) {
               do {
                  byte[] var6 = arg2[var5];
                  if (var6 != null) {
                     int var7 = (class383.field5321[var5] >> 8) * 64 + -class539.field7889;
                     int var8 = (255 & class383.field5321[var5]) * 64 + -class353.field4940;
                     class161.method1344((byte)-104);
                     arg0.method4601(var7, var8, class629.field9294, (byte)-78, var6, class324.field4438);
                  }

                  ++var5;
               } while(var5 < var4);

            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field2246[3] + (arg0 != null ? field2246[4] : field2246[5]) + ',' + arg1 + ',' + (arg2 != null ? field2246[4] : field2246[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "<init>",
      descriptor = "()V"
   )
   public class173() {
   }

   @OriginalMember(
      owner = "client!pga",
      name = "<init>",
      descriptor = "(Lhv;)V"
   )
   public class173(class227 arg0) {
      try {
         this.field2242 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2246[6] + (arg0 != null ? field2246[4] : field2246[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1488(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1489(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
