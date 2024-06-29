import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class346 extends class188 {
   @OriginalMember(
      owner = "client!gt",
      name = "ab",
      descriptor = "Z"
   )
   private boolean field5088 = false;
   @OriginalMember(
      owner = "client!gt",
      name = "P",
      descriptor = "I"
   )
   private int field5093 = 0;
   @OriginalMember(
      owner = "client!gt",
      name = "S",
      descriptor = "I"
   )
   public int field5099 = -1;
   @OriginalMember(
      owner = "client!gt",
      name = "cb",
      descriptor = "I"
   )
   public int field5089 = 0;
   @OriginalMember(
      owner = "client!gt",
      name = "X",
      descriptor = "I"
   )
   public int field5098 = -1;
   @OriginalMember(
      owner = "client!gt",
      name = "kb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5109 = new String[]{method2752(method2751("\u0006+\u001aBjI")), method2752(method2751("\u000f*Xj")), method2752(method2751("\u001aq\u001a(V")), method2752(method2751("\u0006+\u001aK\u0003")), method2752(method2751("\u0006+\u001aGjI")), method2752(method2751("\u0006+\u001aH\u0003")), method2752(method2751("\u0006+\u001aW\u0003")), method2752(method2751("\u000f,Z5")), method2752(method2751("\u000f,Z6")), method2752(method2751("\u000f,Z4")), method2752(method2751("\u0006+\u001aV\u0003")), method2752(method2751("\u000f,Z7")), method2752(method2751("\u0006+\u001aI\u0003")), method2752(method2751("\u0006+\u001aJ\u0003")), method2752(method2751("\u0006+\u001aT\u0003")), method2752(method2751("\u0006+\u001a@jI")), method2752(method2751("\u0006+\u001aNjI")), method2752(method2751("\u0006+\u001aM\u0003"))};
   @OriginalMember(
      owner = "client!gt",
      name = "W",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field5091 = new String[200];
   @OriginalMember(
      owner = "client!gt",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field5092 = new int[]{1, -1, -1, 1};
   @OriginalMember(
      owner = "client!gt",
      name = "ib",
      descriptor = "I"
   )
   public int field5087;
   @OriginalMember(
      owner = "client!gt",
      name = "eb",
      descriptor = "I"
   )
   public static int field5090;
   @OriginalMember(
      owner = "client!gt",
      name = "gb",
      descriptor = "I"
   )
   public static int field5094;
   @OriginalMember(
      owner = "client!gt",
      name = "jb",
      descriptor = "I"
   )
   public static int field5095;
   @OriginalMember(
      owner = "client!gt",
      name = "Y",
      descriptor = "I"
   )
   public static int field5096;
   @OriginalMember(
      owner = "client!gt",
      name = "U",
      descriptor = "I"
   )
   public int field5097;
   @OriginalMember(
      owner = "client!gt",
      name = "db",
      descriptor = "I"
   )
   public static int field5100;
   @OriginalMember(
      owner = "client!gt",
      name = "R",
      descriptor = "I"
   )
   public static int field5101;
   @OriginalMember(
      owner = "client!gt",
      name = "bb",
      descriptor = "I"
   )
   public static int field5102;
   @OriginalMember(
      owner = "client!gt",
      name = "V",
      descriptor = "I"
   )
   public static int field5103;
   @OriginalMember(
      owner = "client!gt",
      name = "Z",
      descriptor = "I"
   )
   public int field5104;
   @OriginalMember(
      owner = "client!gt",
      name = "T",
      descriptor = "I"
   )
   public static int field5105;
   @OriginalMember(
      owner = "client!gt",
      name = "Q",
      descriptor = "I"
   )
   public static int field5106;
   @OriginalMember(
      owner = "client!gt",
      name = "fb",
      descriptor = "I"
   )
   public static int field5107;
   @OriginalMember(
      owner = "client!gt",
      name = "hb",
      descriptor = "I"
   )
   public int field5108;

   @OriginalMember(
      owner = "client!gt",
      name = "j",
      descriptor = "(I)I"
   )
   public final int method728(int arg0) {
      try {
         ++field5090;
         return arg0 != 0 ? -32 : -10;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5109[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class346(int arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(IIILha;)Z"
   )
   public final boolean method718(int arg0, int arg1, int arg2, class17 arg3) {
      try {
         ++field5095;
         class502 var5 = arg3.method254();
         var5.method322(super.field6832, super.field6829 + -10, super.field6833);
         class618 var6 = class201.field2882.method5591(this.field5097, (byte)-84);
         class761 var7 = var6.method4540(-127, arg3, this.field5104, (class384)null, (class258)null, 131072);
         if (var7 != null && (class791.field11526 ? var7.method804(arg0, arg1, var5, true, var6.field8828, class582.field8178) : var7.method748(arg0, arg1, var5, true, var6.field8828))) {
            return true;
         } else {
            if (this.field5099 != -1) {
               class618 var8 = class201.field2882.method5591(this.field5099, (byte)-84);
               class761 var9 = var8.method4540(arg2 + -123, arg3, this.field5108, (class384)null, (class258)null, 131072);
               if (var9 != null && (class791.field11526 ? var9.method804(arg0, arg1, var5, true, var8.field8828, class582.field8178) : var9.method748(arg0, arg1, var5, true, var8.field8828))) {
                  return true;
               }
            }

            if (~this.field5098 != arg2) {
               class618 var10 = class201.field2882.method5591(this.field5098, (byte)-84);
               class761 var11 = var10.method4540(-123, arg3, this.field5087, (class384)null, (class258)null, 131072);
               if (var11 != null && (class791.field11526 ? var11.method804(arg0, arg1, var5, true, var10.field8828, class582.field8178) : var11.method748(arg0, arg1, var5, true, var10.field8828))) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field5109[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5109[2] : field5109[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(ZLha;)Loga;"
   )
   public final class358 method722(boolean arg0, class17 arg1) {
      try {
         if (arg0) {
            this.field5089 = -56;
         }

         ++field5100;
         return null;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5109[0] + arg0 + ',' + (arg1 != null ? field5109[2] : field5109[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2746(int arg0) {
      try {
         field5091 = null;
         if (arg0 != -1) {
            field5092 = null;
         }

         field5092 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5109[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "k",
      descriptor = "(I)Z"
   )
   public final boolean method723(int arg0) {
      try {
         ++field5096;
         if (arg0 > -26) {
            this.field5099 = -60;
         }

         return this.field5088;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5109[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "(ILha;)Lwba;"
   )
   public final class731 method730(int arg0, class17 arg1) {
      boolean var3 = client.field10022;

      try {
         ++field5101;
         class84 var4 = class40.method476(super.field6824, super.field6832 >> class313.field4707, super.field6833 >> class313.field4707);
         class349 var5 = class495.method3755(super.field6824, super.field6832 >> class313.field4707, super.field6833 >> class313.field4707);
         int var6 = 0;
         if (var4 != null && var4.field1299.field8163) {
            var6 = var4.field1299.method728(0);
         }

         if (var5 != null && ~var5.field5124 < ~(-var6)) {
            var6 = -var5.field5124;
         }

         if (~this.field5089 != ~var6) {
            super.field6829 -= this.field5089;
            this.field5089 = var6;
            super.field6829 += var6;
         }

         class502 var7 = arg1.method254();
         var7.method335();
         if (this.field5089 == 0) {
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            class751 var11 = class225.field3197[super.field6826];
            int var12 = this.field5093 << 1;
            int var14 = -var12 / 2;
            int var15 = -var12 / 2;
            int var16 = var11.method5401(super.field6832 + var14, true, super.field6833 + var15);
            int var17 = var12 / 2;
            int var18 = -var12 / 2;
            int var19 = var11.method5401(super.field6832 + var17, true, super.field6833 - -var18);
            int var20 = -var12 / 2;
            int var21 = var12 / 2;
            int var22 = var11.method5401(super.field6832 + var20, true, super.field6833 - -var21);
            int var23 = var12 / 2;
            int var24 = var12 / 2;
            int var25 = var11.method5401(super.field6832 + var23, true, super.field6833 + var24);
            int var26 = ~var16 <= ~var19 ? var19 : var16;
            int var27 = var22 >= var25 ? var25 : var22;
            int var28 = var25 <= var19 ? var25 : var19;
            int var29 = var16 >= var22 ? var22 : var16;
            if (~var12 != -1) {
               int var30 = (int)(2607.5945876176133D * Math.atan2((double)(-var27 + var26), (double)var12)) & 16383;
               if (var30 != 0) {
                  var7.method331(var30);
               }
            }

            int var31 = var16 + var25;
            if (~var12 != -1) {
               int var32 = 16383 & (int)(Math.atan2((double)(var29 - var28), (double)var12) * 2607.5945876176133D);
               if (var32 != 0) {
                  var7.method337(-var32);
               }
            }

            if (~var31 < ~(var19 - -var22)) {
               var31 = var19 + var22;
            }

            int var33 = (var31 >> 1) + -super.field6829;
            if (var33 != 0) {
               var7.method327(0, var33, 0);
            }
         }

         var7.method327(super.field6832, super.field6829 + -10, super.field6833);
         class731 var34 = class54.method574(0, true, 3);
         this.field5088 = false;
         this.field5093 = 0;
         if (this.field5098 != -1) {
            class761 var35 = class201.field2882.method5591(this.field5098, (byte)-84).method4540(-127, arg1, this.field5087, (class384)null, (class258)null, 2048);
            if (var35 != null) {
               label119: {
                  if (!class791.field11526) {
                     var35.method805(var7, var34.field10397[2], 0);
                     if (!var3) {
                        break label119;
                     }
                  }

                  var35.method763(var7, var34.field10397[2], class582.field8178, 0);
               }

               this.field5088 |= var35.method781();
               this.field5093 = var35.method794();
            }
         }

         if (this.field5099 != -1) {
            class761 var36 = class201.field2882.method5591(this.field5099, (byte)-84).method4540(-127, arg1, this.field5108, (class384)null, (class258)null, 2048);
            if (var36 != null) {
               label111: {
                  if (!class791.field11526) {
                     var36.method805(var7, var34.field10397[1], 0);
                     if (!var3) {
                        break label111;
                     }
                  }

                  var36.method763(var7, var34.field10397[1], class582.field8178, 0);
               }

               this.field5088 |= var36.method781();
               if (~var36.method794() < ~this.field5093) {
                  this.field5093 = var36.method794();
               }
            }
         }

         if (arg0 > -30) {
            this.method720((byte)4);
         }

         class761 var37 = class201.field2882.method5591(this.field5097, (byte)-84).method4540(-123, arg1, this.field5104, (class384)null, (class258)null, 2048);
         if (var37 != null) {
            label103: {
               if (class791.field11526) {
                  var37.method763(var7, var34.field10397[0], class582.field8178, 0);
                  if (!var3) {
                     break label103;
                  }
               }

               var37.method805(var7, var34.field10397[0], 0);
            }

            this.field5088 |= var37.method781();
            if (var37.method794() > this.field5093) {
               this.field5093 = var37.method794();
            }
         }

         return var34;
      } catch (RuntimeException var39) {
         throw class612.method4503(var39, field5109[14] + arg0 + ',' + (arg1 != null ? field5109[2] : field5109[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method2747(int arg0) {
      try {
         ++field5103;
         class618 var2 = class201.field2882.method5591(this.field5097, (byte)-84);
         int var3 = var2.field8828;
         if (this.field5099 != -1) {
            class618 var4 = class201.field2882.method5591(this.field5099, (byte)-84);
            if (~var3 > ~var4.field8828) {
               var3 = var4.field8828;
            }
         }

         if (~this.field5098 != arg0) {
            class618 var5 = class201.field2882.method5591(this.field5098, (byte)-84);
            if (var3 < var5.field8828) {
               var3 = var5.field8828;
            }
         }

         return var3;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5109[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "()V"
   )
   public static final void method2748() {
      for(int var0 = 0; var0 < class468.field6786.length; ++var0) {
         class468.field6786[var0].method974();
      }

      class468.field6786 = null;
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(Ljga;Laa;IIIIIIJ)V"
   )
   public static final void method2749(class91 arg0, class684 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
      boolean var10 = client.field10022;

      try {
         ++field5105;
         int var11 = arg5 * arg5 + arg7 * arg7;
         if ((long)var11 <= arg8) {
            label55: {
               int var12 = Math.min(arg0.field1513 / 2, arg0.field1452 / 2);
               if (~var11 >= ~(var12 * var12)) {
                  class460.method3553(arg1, (byte)-125, arg4, arg5, arg0, arg7, class249.field3812[arg3], arg2);
                  if (!var10) {
                     break label55;
                  }
               }

               int var13;
               label44: {
                  var12 -= 10;
                  if (~class306.field4639 != -5) {
                     var13 = (int)class86.field1312 + class647.field9122 & 16383;
                     if (!var10) {
                        break label44;
                     }
                  }

                  var13 = 16383 & (int)class86.field1312;
               }

               int var14 = class160.field2447[var13];
               int var15 = class160.field2446[var13];
               if (class306.field4639 != 4) {
                  var15 = var15 * 256 / (class455.field6620 + 256);
                  var14 = var14 * 256 / (class455.field6620 - -256);
               }

               int var16 = arg5 * var14 - -(arg7 * var15) >> 14;
               int var17 = arg5 * var15 + -(arg7 * var14) >> 14;
               double var18 = Math.atan2((double)var16, (double)var17);
               int var20 = (int)(Math.sin(var18) * (double)var12);
               int var21 = (int)((double)var12 * Math.cos(var18));
               class175.field2604[arg3].method1445((float)arg0.field1513 / 2.0F + (float)arg4 + (float)var20, (float)arg0.field1452 / 2.0F + (float)arg2 - (float)var21, 4096, (int)(-var18 / 6.283185307179586D * 65535.0D));
            }

            if (arg6 != -19659) {
               method2746(120);
            }
         }
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field5109[6] + (arg0 != null ? field5109[2] : field5109[1]) + ',' + (arg1 != null ? field5109[2] : field5109[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public final void method726(class17 arg0, byte arg1) {
      try {
         int var3 = -101 % ((39 - arg1) / 46);
         ++field5107;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5109[13] + (arg0 != null ? field5109[2] : field5109[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "e",
      descriptor = "(B)I"
   )
   public final int method720(byte arg0) {
      try {
         if (arg0 > -75) {
            this.method2747(60);
         }

         ++field5102;
         return this.field5093;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5109[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "h",
      descriptor = "(I)Z"
   )
   public final boolean method725(int arg0) {
      try {
         ++field5094;
         if (arg0 != -6664) {
            this.method722(false, (class17)null);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5109[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(ILlw;)V"
   )
   public static final void method2750(int param0, class408 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2751(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2752(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
