import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class732 extends class422 {
   @OriginalMember(
      owner = "client!ai",
      name = "I",
      descriptor = "I"
   )
   private int field10674;
   @OriginalMember(
      owner = "client!ai",
      name = "u",
      descriptor = "I"
   )
   private int field10670;
   @OriginalMember(
      owner = "client!ai",
      name = "P",
      descriptor = "I"
   )
   private int field10666;
   @OriginalMember(
      owner = "client!ai",
      name = "B",
      descriptor = "I"
   )
   private int field10662;
   @OriginalMember(
      owner = "client!ai",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10681 = new String[]{method5293(method5292("\u0004{o'!")), method5293(method5292("\u0004{o1!")), method5293(method5292("\u0004{o4!")), method5293(method5292("\u0004{o?!")), method5293(method5292("\u001e<oYt")), method5293(method5292("\u000bg-\u001b")), method5293(method5292("\u0004{o&!")), method5293(method5292("\u0004{o2!")), method5293(method5292("\u0004{o%!")), method5293(method5292("\u0004{oK`\u000b{5I!")), method5293(method5292("\u0004{o8!")), method5293(method5292("\u0004{o5!"))};
   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "Ll;"
   )
   public static class292 field10664 = new class292("", 15);
   @OriginalMember(
      owner = "client!ai",
      name = "M",
      descriptor = "I"
   )
   public static int field10658;
   @OriginalMember(
      owner = "client!ai",
      name = "x",
      descriptor = "I"
   )
   public static int field10659;
   @OriginalMember(
      owner = "client!ai",
      name = "H",
      descriptor = "I"
   )
   public static int field10660;
   @OriginalMember(
      owner = "client!ai",
      name = "y",
      descriptor = "I"
   )
   private int field10661;
   @OriginalMember(
      owner = "client!ai",
      name = "t",
      descriptor = "I"
   )
   private int field10663;
   @OriginalMember(
      owner = "client!ai",
      name = "v",
      descriptor = "I"
   )
   public static int field10665;
   @OriginalMember(
      owner = "client!ai",
      name = "O",
      descriptor = "I"
   )
   private int field10667;
   @OriginalMember(
      owner = "client!ai",
      name = "E",
      descriptor = "I"
   )
   public static int field10668;
   @OriginalMember(
      owner = "client!ai",
      name = "J",
      descriptor = "I"
   )
   public static int field10669;
   @OriginalMember(
      owner = "client!ai",
      name = "A",
      descriptor = "I"
   )
   private int field10671;
   @OriginalMember(
      owner = "client!ai",
      name = "L",
      descriptor = "I"
   )
   public static int field10673;
   @OriginalMember(
      owner = "client!ai",
      name = "w",
      descriptor = "I"
   )
   public static int field10675;
   @OriginalMember(
      owner = "client!ai",
      name = "N",
      descriptor = "I"
   )
   public static int field10677;
   @OriginalMember(
      owner = "client!ai",
      name = "C",
      descriptor = "I"
   )
   public static int field10680;
   @OriginalMember(
      owner = "client!ai",
      name = "D",
      descriptor = "Ldv;"
   )
   public static class131 field10672;
   @OriginalMember(
      owner = "client!ai",
      name = "G",
      descriptor = "Lww;"
   )
   public static class339 field10676;
   @OriginalMember(
      owner = "client!ai",
      name = "F",
      descriptor = "Let;"
   )
   public static class753 field10678;
   @OriginalMember(
      owner = "client!ai",
      name = "K",
      descriptor = "[B"
   )
   private byte[] field10679;

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(IIJIZ)Ljava/lang/String;"
   )
   public static final String method5287(int arg0, int arg1, long arg2, int arg3, boolean arg4) {
      boolean var6 = client.field1481;

      try {
         ++field10677;
         char var7 = ',';
         char var8 = '.';
         if (~arg1 == -1) {
            var7 = '.';
            var8 = ',';
         }

         if (~arg1 == -3) {
            var8 = 160;
         }

         byte var9 = 0;
         if (~arg2 > -1L) {
            var9 = 1;
            arg2 = -arg2;
         }

         StringBuffer var10 = new StringBuffer(26);
         if (~arg0 < -1) {
            int var11 = 0;
            if (var6 || ~var11 > ~arg0) {
               do {
                  int var12 = (int)arg2;
                  arg2 /= 10L;
                  var10.append((char)(48 - ((int)arg2 * 10 + -var12)));
                  ++var11;
               } while(~var11 > ~arg0);
            }

            var10.append(var7);
         }

         int var13 = arg3;

         int var10000;
         while(true) {
            int var14 = (int)arg2;
            arg2 /= 10L;
            var10.append((char)(-((int)arg2 * 10) + 48 + var14));
            if (~arg2 != -1L) {
               if (!arg4) {
                  continue;
               }

               ++var13;
               var10000 = var13 % 3;
               if (var6) {
                  break;
               }

               if (var10000 != 0) {
                  continue;
               }

               var10.append(var8);
               if (!var6) {
                  continue;
               }
            }

            var10000 = var9;
            break;
         }

         if (var10000 != 0) {
            var10.append('-');
         }

         return var10.reverse().toString();
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field10681[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method5288(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         label16: {
            if (~arg1 <= ~arg4) {
               class385.method3045(arg0, arg1, class237.field3001[arg2], arg4, (byte)-106);
               if (!client.field1481) {
                  break label16;
               }
            }

            class385.method3045(arg0, arg4, class237.field3001[arg2], arg1, (byte)-112);
         }

         ++field10669;
         int var5 = 90 % ((arg3 - -13) / 58);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10681[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method3278(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 8302) {
            method5290((class9)null, -70);
         }

         ++field10668;
         if (~arg2 == -1) {
            this.field10671 = this.field10670 + -(arg0 >= 0 ? arg0 : -arg0);
            this.field10667 = 4096;
            this.field10671 = this.field10671 * this.field10671 >> 12;
            this.field10663 = this.field10671;
         } else {
            label35: {
               this.field10667 = this.field10674 * this.field10671 >> 12;
               this.field10671 = this.field10670 + -(~arg0 > -1 ? -arg0 : arg0);
               if (this.field10667 >= 0) {
                  if (~this.field10667 >= -4097) {
                     break label35;
                  }

                  this.field10667 = 4096;
                  if (!client.field1481) {
                     break label35;
                  }
               }

               this.field10667 = 0;
            }

            this.field10671 = this.field10671 * this.field10671 >> 12;
            this.field10671 = this.field10671 * this.field10667 >> 12;
            this.field10663 += this.field10671 * this.field10662 >> 12;
            this.field10662 = this.field10666 * this.field10662 >> 12;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10681[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method5289(int arg0) {
      try {
         if (arg0 != -1) {
            field10658 = 65;
         }

         field10678 = null;
         field10664 = null;
         field10672 = null;
         field10676 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10681[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(Lkw;I)V"
   )
   public static final void method5290(class9 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ai",
      name = "<init>",
      descriptor = "(IIIIIFFF)V"
   )
   public class732(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field10674 = (int)(arg7 * 4096.0F);
         this.field10670 = (int)(arg6 * 4096.0F);
         this.field10662 = this.field10666 = (int)(4096.0D * Math.pow(0.5D, (double)(-arg5)));
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field10681[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "a",
      descriptor = "(IZB)V"
   )
   public void method353(int arg0, boolean arg1, byte arg2) {
      try {
         this.field10679[arg0] = arg2;
         if (!arg1) {
            ++field10659;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10681[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3277(int arg0) {
      try {
         if (arg0 != -1136577940) {
            method5290((class9)null, 73);
         }

         this.field10663 = 0;
         this.field10661 = 0;
         ++field10673;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10681[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3275(int arg0) {
      try {
         this.field10662 = this.field10666;
         if (arg0 != 19733) {
            this.method353(26, false, (byte)-77);
         }

         label23: {
            ++field10665;
            this.field10663 >>= 4;
            if (this.field10663 >= 0) {
               if (this.field10663 <= 255) {
                  break label23;
               }

               this.field10663 = 255;
               if (!client.field1481) {
                  break label23;
               }
            }

            this.field10663 = 0;
         }

         this.method353(this.field10661++, false, (byte)this.field10663);
         this.field10663 = 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10681[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "f",
      descriptor = "(I)Lfv;"
   )
   public static final class702 method5291(int arg0) {
      try {
         ++field10675;
         if (class155.field1999 == 0) {
            return new class702();
         } else {
            if (arg0 <= 89) {
               field10658 = 62;
            }

            return class259.field3300[--class155.field1999];
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10681[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5292(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ai",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5293(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
