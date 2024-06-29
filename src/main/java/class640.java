import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class640 extends class484 implements class434 {
   @OriginalMember(
      owner = "client!jja",
      name = "R",
      descriptor = "Z"
   )
   private boolean field9270 = true;
   @OriginalMember(
      owner = "client!jja",
      name = "eb",
      descriptor = "Lwh;"
   )
   public class522 field9260;
   @OriginalMember(
      owner = "client!jja",
      name = "Q",
      descriptor = "Z"
   )
   private boolean field9261;
   @OriginalMember(
      owner = "client!jja",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9281 = new String[]{method4677(method4676("\u007f{`pg=")), method4677(method4676("{dm2")), method4677(method4676("n?/pQ")), method4677(method4676("\u007f{`p\u007f=")), method4677(method4676("\u007f{`pmT9")), method4677(method4676("\u007f{`pn=")), method4677(method4676("\u007f{`px=")), method4677(method4676("\u007f{`p|=")), method4677(method4676("\u007f{`pa=")), method4677(method4676("\u007f{`pk=")), method4677(method4676("\u007f{`pc=")), method4677(method4676("\u007f{`pz=")), method4677(method4676("\u007f{`p`=")), method4677(method4676("\u007f{`pe=")), method4677(method4676("\u007f{`p}=")), method4677(method4676("\u007f{`pf=")), method4677(method4676("\u007f{`ph=")), method4677(method4676("\u007f{`pj=")), method4677(method4676("\u007f{`p\u0010|\u007fh*\u0012=")), method4677(method4676("\u007f{`py=")), method4677(method4676("\u007f{`pnT9")), method4677(method4676("\u007f{`pd=")), method4677(method4676("\u007f{`pb="))};
   @OriginalMember(
      owner = "client!jja",
      name = "jb",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field9275 = new Rectangle[100];
   @OriginalMember(
      owner = "client!jja",
      name = "W",
      descriptor = "[I"
   )
   public static int[] field9278;
   @OriginalMember(
      owner = "client!jja",
      name = "X",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field9277;
   @OriginalMember(
      owner = "client!jja",
      name = "N",
      descriptor = "I"
   )
   public static int field9280;
   @OriginalMember(
      owner = "client!jja",
      name = "V",
      descriptor = "I"
   )
   public static int field9253;
   @OriginalMember(
      owner = "client!jja",
      name = "T",
      descriptor = "I"
   )
   public static int field9254;
   @OriginalMember(
      owner = "client!jja",
      name = "db",
      descriptor = "I"
   )
   public static int field9255;
   @OriginalMember(
      owner = "client!jja",
      name = "S",
      descriptor = "I"
   )
   public static int field9256;
   @OriginalMember(
      owner = "client!jja",
      name = "kb",
      descriptor = "I"
   )
   public static int field9257;
   @OriginalMember(
      owner = "client!jja",
      name = "cb",
      descriptor = "I"
   )
   public static int field9258;
   @OriginalMember(
      owner = "client!jja",
      name = "ab",
      descriptor = "I"
   )
   public static int field9259;
   @OriginalMember(
      owner = "client!jja",
      name = "fb",
      descriptor = "I"
   )
   public static int field9262;
   @OriginalMember(
      owner = "client!jja",
      name = "P",
      descriptor = "I"
   )
   public static int field9263;
   @OriginalMember(
      owner = "client!jja",
      name = "pb",
      descriptor = "I"
   )
   public static int field9264;
   @OriginalMember(
      owner = "client!jja",
      name = "bb",
      descriptor = "I"
   )
   public static int field9265;
   @OriginalMember(
      owner = "client!jja",
      name = "hb",
      descriptor = "I"
   )
   public static int field9266;
   @OriginalMember(
      owner = "client!jja",
      name = "Y",
      descriptor = "I"
   )
   public static int field9267;
   @OriginalMember(
      owner = "client!jja",
      name = "gb",
      descriptor = "I"
   )
   public static int field9268;
   @OriginalMember(
      owner = "client!jja",
      name = "mb",
      descriptor = "I"
   )
   public static int field9271;
   @OriginalMember(
      owner = "client!jja",
      name = "ib",
      descriptor = "I"
   )
   public static int field9272;
   @OriginalMember(
      owner = "client!jja",
      name = "ob",
      descriptor = "I"
   )
   public static int field9273;
   @OriginalMember(
      owner = "client!jja",
      name = "O",
      descriptor = "I"
   )
   public static int field9274;
   @OriginalMember(
      owner = "client!jja",
      name = "nb",
      descriptor = "I"
   )
   public static int field9276;
   @OriginalMember(
      owner = "client!jja",
      name = "lb",
      descriptor = "Lkf;"
   )
   public static class401 field9279;
   @OriginalMember(
      owner = "client!jja",
      name = "Z",
      descriptor = "Lil;"
   )
   private class680 field9269;

   @OriginalMember(
      owner = "client!jja",
      name = "<init>",
      descriptor = "(Lha;Lru;IIIIIZIIIII)V"
   )
   public class640(class610 arg0, class333 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);

      try {
         this.field9260 = new class522(arg0, arg1, arg10, arg11, super.field1506, arg3, this, arg7, arg12);
         this.field9261 = ~arg1.field5071 != -1 && !arg7;
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field9281[18] + (arg0 != null ? field9281[2] : field9281[1]) + ',' + (arg1 != null ? field9281[2] : field9281[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(BLha;)Lpga;"
   )
   public final class788 method56(byte arg0, class610 arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9271;
         class91 var4 = this.field9260.method4020(arg1, true, false, arg0 ^ 3879, 2048);
         if (var4 == null) {
            return null;
         } else {
            if (arg0 != -20) {
               this.method239(-37);
            }

            class788 var6;
            label58: {
               class401 var5 = arg1.method640();
               var5.method1542(super.field1505 - -super.field7364, super.field1495, super.field1494 - -super.field7372);
               var6 = class333.method2708((byte)116, 1, this.field9261);
               int var7 = super.field1505 >> 9;
               int var8 = super.field1494 >> 9;
               this.field9260.method4027(true, var7, var8, true, var8, var7, var4, var5, arg1);
               if (class334.field5143) {
                  var4.method905(var5, var6.field11545[0], class591.field8709, 0);
                  if (!var3) {
                     break label58;
                  }
               }

               var4.method897(var5, var6.field11545[0], 0);
            }

            if (this.field9260.field7951 != null) {
               label52: {
                  class43 var9 = this.field9260.field7951.method5459();
                  if (!class334.field5143) {
                     arg1.method652(var9);
                     if (!var3) {
                        break label52;
                     }
                  }

                  arg1.method641(var9, class591.field8709);
               }
            }

            this.field9270 = var4.method892() || this.field9260.field7951 != null;
            if (this.field9269 != null) {
               class336.method2739(this.field9269, (byte)53, var4, super.field1494, super.field1495, super.field1505);
               if (!var3) {
                  return var6;
               }
            }

            this.field9269 = class404.method3254(-125, super.field1494, super.field1495, var4, super.field1505);
            return var6;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field9281[16] + arg0 + ',' + (arg1 != null ? field9281[2] : field9281[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method241(int arg0) {
      try {
         ++field9273;
         if (arg0 != -18128) {
            field9279 = null;
         }

         return this.field9260.method4029((byte)-24);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9281[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method233(boolean arg0) {
      try {
         ++field9259;
         if (arg0) {
            this.field9260 = null;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9281[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(ILha;)Lil;"
   )
   public final class680 method41(int arg0, class610 arg1) {
      try {
         if (arg0 != 4058) {
            return null;
         } else {
            ++field9264;
            return this.field9269;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9281[21] + arg0 + ',' + (arg1 != null ? field9281[2] : field9281[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(Lha;IIZ)Z"
   )
   public final boolean method43(class610 arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field9268;
         class91 var5 = this.field9260.method4020(arg0, arg3, false, -3893, 131072);
         if (var5 == null) {
            return false;
         } else {
            class401 var6 = arg0.method640();
            var6.method1542(super.field7364 + super.field1505, super.field1495, super.field1494 - -super.field7372);
            return !class334.field5143 ? var5.method886(arg2, arg1, var6, false, 0) : var5.method912(arg2, arg1, var6, false, 0, class591.field8709);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9281[7] + (arg0 != null ? field9281[2] : field9281[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(Lff;B)V"
   )
   public final void method4671(class752 arg0, byte arg1) {
      try {
         if (arg1 <= 81) {
            field9277 = null;
         }

         ++field9272;
         this.field9260.method4021(arg0, (byte)68);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9281[13] + (arg0 != null ? field9281[2] : field9281[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method236(byte arg0) {
      try {
         ++field9274;
         if (arg0 != -11) {
            this.method56((byte)-47, (class610)null);
         }

         return this.field9260.field7930;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9281[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "(Lha;I)V"
   )
   public final void method49(class610 arg0, int arg1) {
      try {
         ++field9265;
         if (arg1 != -16) {
            method4675((byte)-114);
         }

         class91 var3 = this.field9260.method4020(arg0, true, false, -3893, 262144);
         if (var3 != null) {
            int var4 = super.field1505 >> 9;
            int var5 = super.field1494 >> 9;
            class401 var6 = arg0.method640();
            var6.method1542(super.field1505, super.field1495, super.field1494);
            this.field9260.method4027(false, var4, var5, true, var5, var4, var3, var6, arg0);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9281[12] + (arg0 != null ? field9281[2] : field9281[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)V"
   )
   public static final void method4672(int arg0, Canvas arg1) {
      try {
         ++field9267;
         Dimension var2 = arg1.getSize();
         class6.method26(false, var2.width, var2.height);
         if (class67.field883 != arg0) {
            class450.field6888.method674(arg1, class86.field1255, class208.field3176);
         } else {
            class450.field6888.method674(arg1, class790.field11557, class63.field837);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9281[5] + arg0 + ',' + (arg1 != null ? field9281[2] : field9281[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public final void method238(class610 arg0, int arg1) {
      try {
         int var3 = 76 / ((-20 - arg1) / 62);
         ++field9266;
         this.field9260.method4023(arg0, -1);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9281[3] + (arg0 != null ? field9281[2] : field9281[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method232(int arg0) {
      try {
         int var2 = -59 / ((arg0 - 54) / 59);
         ++field9263;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9281[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "k",
      descriptor = "(I)I"
   )
   public final int method239(int arg0) {
      try {
         ++field9258;
         int var2 = -50 / ((arg0 - -44) / 39);
         return this.field9260.method4028(119);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9281[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public final void method227(class610 arg0, byte arg1) {
      try {
         int var3 = -119 % ((30 - arg1) / 34);
         this.field9260.method4026(arg0, (byte)61);
         ++field9256;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9281[11] + (arg0 != null ? field9281[2] : field9281[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "g",
      descriptor = "(I)Z"
   )
   public final boolean method228(int arg0) {
      try {
         if (arg0 != 0) {
            return true;
         } else {
            ++field9255;
            return this.field9270;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9281[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "m",
      descriptor = "(I)V"
   )
   public static final void method4673(int arg0) {
      try {
         ++field9257;
         class12.field156 = 1;
         int var1 = 2 % ((arg0 - 18) / 51);
         class444.field6812 = -1;
         class37.field448 = class510.field7800;
         String var2 = null;
         if (class625.field9068 != null) {
            class354 var3 = new class354(class625.field9068);
            var2 = class484.method3768((byte)8, var3.method2898(32109));
            class656.field9800 = var3.method2898(32109);
         }

         if (var2 == null) {
            class56.method418(35, (byte)66);
         } else {
            class766.method5600(var2, true, (byte)-126, "", false);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9281[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "h",
      descriptor = "(I)I"
   )
   public final int method230(int arg0) {
      try {
         if (arg0 != 2) {
            this.field9269 = null;
         }

         ++field9254;
         return this.field9260.method4019((byte)-61);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9281[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method237(int arg0) {
      try {
         if (arg0 != 28440) {
            this.method41(-80, (class610)null);
         }

         ++field9262;
         return this.field9260.field7957;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9281[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method4674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field1786;

      try {
         ++field9276;
         if (!client.method1170(arg3, (byte)-119)) {
            if (arg7 != -1) {
               class721.field10798[arg7] = true;
            } else {
               int var10 = 0;
               if (var9) {
                  class721.field10798[var10] = true;
                  ++var10;
               }

               while(true) {
                  while(var10 < 100) {
                     class721.field10798[var10] = true;
                     ++var10;
                  }

                  if (!var9) {
                     return;
                  }

                  ++var10;
               }
            }
         } else {
            if (arg4 != -25977) {
               method4674(-11, 39, -25, -40, -79, -89, -66, 89, -98);
            }

            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (class281.field4472) {
               var15 = class528.field8017;
               var11 = class45.field603;
               var13 = class627.field9082;
               var14 = class604.field8829;
               var12 = class559.field8323;
               class528.field8017 = 1;
            }

            label91: {
               if (class505.field7743[arg3] == null) {
                  class419.method3338(arg5, arg8, (byte)92, arg7, arg6, arg2, arg7 < 0, arg1, arg0, -1, class296.field4672[arg3]);
                  if (!var9) {
                     break label91;
                  }
               }

               class419.method3338(arg5, arg8, (byte)1, arg7, arg6, arg2, ~arg7 > -1, arg1, arg0, -1, class505.field7743[arg3]);
            }

            if (class281.field4472) {
               if (~arg7 <= -1 && ~class528.field8017 == -3) {
                  class171.method1580(class627.field9082, class604.field8829, -22, class559.field8323, class45.field603);
               }

               class559.field8323 = var12;
               class627.field9082 = var13;
               class45.field603 = var11;
               class528.field8017 = var15;
               class604.field8829 = var14;
            }
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field9281[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method4675(byte arg0) {
      try {
         if (arg0 != -57) {
            field9278 = null;
         }

         field9275 = null;
         field9278 = null;
         field9279 = null;
         field9277 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9281[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method231(byte arg0) {
      try {
         if (arg0 != -42) {
            this.method237(-33);
         }

         ++field9253;
         return this.field9260.field7926;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9281[22] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -101; ++var0) {
         field9275[var0] = new Rectangle();
      }

      field9278 = new int[]{0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
      field9277 = new Hashtable();
      field9280 = 0;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4676(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4677(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
