import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class class762 extends class713 {
   @OriginalMember(
      owner = "client!on",
      name = "A",
      descriptor = "S"
   )
   public short field11165;
   @OriginalMember(
      owner = "client!on",
      name = "G",
      descriptor = "S"
   )
   public short field11157;
   @OriginalMember(
      owner = "client!on",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11166 = new String[]{method5526(method5525(".\u000b\u0013\u0010a")), method5526(method5525(".\u000b\u0013\u0003\bi")), method5526(method5525("/\u0010Q+")), method5526(method5525(":K\u0013i4")), method5526(method5525(".\u000b\u0013\u000e\bi")), method5526(method5525(".\u000b\u0013\u0011a")), method5526(method5525(".\u000b\u0013{ /\fIya")), method5526(method5525(".\u000b\u0013\u0000\bi")), method5526(method5525(".\u000b\u0013\u0004\bi")), method5526(method5525(".\u000b\u0013\u0006\bi")), method5526(method5525(".\u000b\u0013\u0001\bi")), method5526(method5525(".\u000b\u0013\u0012a"))};
   @OriginalMember(
      owner = "client!on",
      name = "C",
      descriptor = "I"
   )
   public static int field11153;
   @OriginalMember(
      owner = "client!on",
      name = "w",
      descriptor = "I"
   )
   public static int field11154;
   @OriginalMember(
      owner = "client!on",
      name = "u",
      descriptor = "I"
   )
   public static int field11155;
   @OriginalMember(
      owner = "client!on",
      name = "y",
      descriptor = "I"
   )
   public static int field11156;
   @OriginalMember(
      owner = "client!on",
      name = "v",
      descriptor = "I"
   )
   public static int field11158;
   @OriginalMember(
      owner = "client!on",
      name = "F",
      descriptor = "I"
   )
   public static int field11160;
   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "I"
   )
   public static int field11162;
   @OriginalMember(
      owner = "client!on",
      name = "D",
      descriptor = "I"
   )
   public static int field11163;
   @OriginalMember(
      owner = "client!on",
      name = "x",
      descriptor = "I"
   )
   public static int field11164;
   @OriginalMember(
      owner = "client!on",
      name = "B",
      descriptor = "Lww;"
   )
   public static class339 field11161;
   @OriginalMember(
      owner = "client!on",
      name = "E",
      descriptor = "[Lpd;"
   )
   public static class648[] field11159;

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5522(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field1481;

      try {
         ++field11158;
         if (class175.field2258 == 1) {
            int var6 = arg4 / class390.field5409;
            if (arg3 > -63) {
               method5522(-107, -85, 81, 73, 110);
            }

            int var7 = arg0 / class390.field5409;
            int var8 = arg1 / class139.field1759;
            int var9 = arg2 / class139.field1759;
            if (var6 < class32.field475 && ~var7 <= -1 && class674.field9985 > var8 && ~var9 <= -1) {
               if (var8 < 0) {
                  var8 = 0;
               }

               if (~var6 > -1) {
                  var6 = 0;
               }

               if (class674.field9985 <= var9) {
                  var9 = class674.field9985 + -1;
               }

               if (~class32.field475 >= ~var7) {
                  var7 = class32.field475 + -1;
               }

               int var10 = var8;
               if (var5 || ~var8 >= ~var9) {
                  do {
                     int var11 = class684.method4985(117, class674.field9985, var10 - -class728.field10621) * class32.field475;
                     int var12 = var6;
                     if (var5 || var6 <= var7) {
                        do {
                           int var13 = class684.method4985(115, class32.field475, var12 - -class470.field6471) + var11;
                           class134.field1704[var13] = class631.field9309;
                           ++var12;
                        } while(var12 <= var7);
                     }

                     ++var10;
                  } while(~var10 >= ~var9);

               }
            }
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field11166[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method5523(int arg0) {
      try {
         field11159 = null;
         if (arg0 <= -90) {
            field11161 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11166[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method190(int arg0) {
      try {
         if (arg0 != 0) {
            this.method240(41, (class243[])null);
         }

         ++field11156;
         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11166[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "d",
      descriptor = "(Z)Z"
   )
   public final boolean method244(boolean arg0) {
      try {
         if (arg0) {
            return false;
         } else {
            ++field11160;
            return class276.field3516[(super.field10467 >> class783.field11447) + -class699.field10231 - -class106.field1403][(super.field10468 >> class783.field11447) + class106.field1403 + -class664.field9833];
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11166[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method178(int arg0) {
      try {
         if (arg0 != -1) {
            field11159 = null;
         }

         ++field11163;
         return false;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11166[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(Lha;ZZLnl;III)V"
   )
   public final void method183(class479 arg0, boolean arg1, boolean arg2, class713 arg3, int arg4, int arg5, int arg6) {
      try {
         ++field11153;
         if (!arg1) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field11166[8] + (arg0 != null ? field11166[3] : field11166[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11166[3] : field11166[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(I[Lue;)I"
   )
   public final int method240(int arg0, class243[] arg1) {
      try {
         ++field11155;
         if (arg0 != 1) {
            this.method178(1);
         }

         return this.method5206(super.field10467 >> class783.field11447, super.field10468 >> class783.field11447, arg1, (byte)56);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11166[10] + arg0 + ',' + (arg1 != null ? field11166[3] : field11166[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "(ILha;)Z"
   )
   public final boolean method242(int arg0, class479 arg1) {
      try {
         if (arg0 != -5) {
            return true;
         } else {
            ++field11164;
            return class73.method709((byte)41, super.field10459, this.method76((byte)21), super.field10468 >> class783.field11447, super.field10467 >> class783.field11447);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11166[4] + arg0 + ',' + (arg1 != null ? field11166[3] : field11166[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(ILoca;IILha;I)V"
   )
   public static final void method5524(int arg0, class642 arg1, int arg2, int arg3, class479 arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field11162;
         int var7 = 7;
         int var10000;
         if (var6) {
            var10000 = 127;
         } else if (var7 < 0) {
            var10000 = arg0;
            if (!var6) {
               if (arg0 != 0) {
                  field11159 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = 127;
         }

         while(true) {
            label77: {
               int var8 = var10000;
               if (var6) {
                  class387.method3051(124, true, false);
               } else if (~var8 > -1) {
                  if (!var6) {
                     break label77;
                  }
               } else {
                  class387.method3051(124, true, false);
               }

               while(true) {
                  int var9 = 127 & var8 | (7 & var7) << 7 | 64512 & arg5 << 10;
                  int var10 = class535.field7840[var9];
                  class201.method1661(20251, false, true);
                  arg4.method513((arg1.field9629 * var8 >> 7) + arg3, ((7 - var7) * arg1.field9572 >> 3) + arg2, (arg1.field9629 >> 7) + 1, (arg1.field9572 >> 3) + 1, var10, 0);
                  --var8;
                  if (~var8 > -1) {
                     if (!var6) {
                        break;
                     }
                  } else {
                     class387.method3051(124, true, false);
                  }
               }
            }

            --var7;
            if (var7 < 0) {
               var10000 = arg0;
               if (!var6) {
                  if (arg0 != 0) {
                     field11159 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = 127;
            }
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field11166[9] + arg0 + ',' + (arg1 != null ? field11166[3] : field11166[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field11166[3] : field11166[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "<init>",
      descriptor = "(IIIIIII)V"
   )
   public class762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         super.field10457 = (byte)arg3;
         super.field10468 = arg2;
         super.field10459 = (byte)arg4;
         this.field11165 = (short)arg5;
         super.field10467 = arg0;
         super.field10466 = arg1;
         this.field11157 = (short)arg6;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field11166[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5525(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5526(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
