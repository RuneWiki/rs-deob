import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class37 extends class213 {
   @OriginalMember(
      owner = "client!uja",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field440 = new String[]{method290(method289("-X\f@tp")), method290(method289("-X\f@|p")), method290(method289("-X\f@}p")), method290(method289("-X\f@\u007fp")), method290(method289("-X\f@yp")), method290(method289("#\u001cC@C")), method290(method289("6G\u0001\u0002"))};
   @OriginalMember(
      owner = "client!uja",
      name = "F",
      descriptor = "Lo;"
   )
   public static class31 field437 = new class31(8, 19);
   @OriginalMember(
      owner = "client!uja",
      name = "G",
      descriptor = "I"
   )
   public static int field435;
   @OriginalMember(
      owner = "client!uja",
      name = "D",
      descriptor = "I"
   )
   public static int field436;
   @OriginalMember(
      owner = "client!uja",
      name = "E",
      descriptor = "I"
   )
   public static int field438;
   @OriginalMember(
      owner = "client!uja",
      name = "H",
      descriptor = "I"
   )
   public static int field439;

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field435;
         int[] var4 = super.field2650.method3769(arg0, arg1 + -2064866512);
         if (arg1 != 2064866508) {
            this.method215(24, 120);
         }

         if (super.field2650.field7140) {
            int var5 = 0;
            if (var3 || ~var5 > ~class576.field7916) {
               do {
                  this.method287((byte)-94, var5, arg0);
                  int[] var6 = this.method1619((byte)95, class597.field8305, 0);
                  var4[var5] = var6[class779.field11369];
                  ++var5;
               } while(~var5 > ~class576.field7916);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field440[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "b",
      descriptor = "(BII)V"
   )
   private final void method287(byte arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         ++field438;
         int var5 = class534.field7301[arg1];
         if (arg0 == -94) {
            label114: {
               int var6 = class551.field7586[arg2];
               float var7 = (float)Math.atan2((double)(var5 + -2048), (double)(var6 - 2048));
               if (!((double)var7 >= -3.141592653589793D) || !((double)var7 <= -2.356194490192345D)) {
                  if (!((double)var7 <= -1.5707963267948966D) || !((double)var7 >= -2.356194490192345D)) {
                     if (!((double)var7 <= -0.7853981633974483D) || !((double)var7 >= -1.5707963267948966D)) {
                        if (var7 <= 0.0F && (double)var7 >= -0.7853981633974483D) {
                           class597.field8305 = -arg2 + class392.field5515;
                           class779.field11369 = arg1;
                           if (!var4) {
                              break label114;
                           }
                        }

                        if (var7 >= 0.0F && (double)var7 <= 0.7853981633974483D) {
                           class779.field11369 = -arg1 + class576.field7916;
                           class597.field8305 = -arg2 + class392.field5515;
                           if (!var4) {
                              break label114;
                           }
                        }

                        if (!((double)var7 >= 0.7853981633974483D) || !((double)var7 <= 1.5707963267948966D)) {
                           if ((double)var7 >= 1.5707963267948966D && (double)var7 <= 2.356194490192345D) {
                              class597.field8305 = -arg1 + class392.field5515;
                              class779.field11369 = arg2;
                              if (!var4) {
                                 break label114;
                              }
                           }

                           if (!((double)var7 >= 2.356194490192345D) || !((double)var7 <= 3.141592653589793D)) {
                              break label114;
                           }

                           class597.field8305 = arg2;
                           class779.field11369 = -arg1 + class576.field7916;
                           if (!var4) {
                              break label114;
                           }
                        }

                        class597.field8305 = -arg1 + class392.field5515;
                        class779.field11369 = -arg2 + class576.field7916;
                        if (!var4) {
                           break label114;
                        }
                     }

                     class779.field11369 = class576.field7916 - arg2;
                     class597.field8305 = arg1;
                     if (!var4) {
                        break label114;
                     }
                  }

                  class779.field11369 = arg2;
                  class597.field8305 = arg1;
                  if (!var4) {
                     break label114;
                  }
               }

               class779.field11369 = arg1;
               class597.field8305 = arg2;
            }

            class597.field8305 &= class40.field468;
            class779.field11369 &= class676.field9924;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field440[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field436;
         int var4 = 2 % ((arg1 - 68) / 48);
         if (arg2 == 0) {
            super.field2645 = ~arg0.method4288((byte)63) == -2;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field440[4] + (arg0 != null ? field440[5] : field440[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "<init>",
      descriptor = "()V"
   )
   public class37() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field439;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (arg1 <= 26) {
            this.method212(-36, (byte)-68);
         }

         if (super.field2644.field6719) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 || ~var8 > ~class576.field7916) {
               do {
                  this.method287((byte)-94, var8, arg0);
                  int[][] var9 = this.method1615(true, class597.field8305, 0);
                  var5[var8] = var9[0][class779.field11369];
                  var6[var8] = var9[1][class779.field11369];
                  var7[var8] = var9[2][class779.field11369];
                  ++var8;
               } while(~var8 > ~class576.field7916);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field440[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method288(int arg0) {
      try {
         if (arg0 == 2) {
            field437 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field440[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method289(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method290(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
