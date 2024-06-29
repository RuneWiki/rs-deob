import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class733 extends class322 {
   @OriginalMember(
      owner = "client!waa",
      name = "w",
      descriptor = "[I"
   )
   private int[] field10719;
   @OriginalMember(
      owner = "client!waa",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10733 = new String[]{method5337(method5336("X4@)q\u0007")), method5337(method5336("A Mk")), method5337(method5336("T{\u000f)E")), method5337(method5336("X4@)\u007f\u0007")), method5337(method5336("X4@)u\u0007")), method5337(method5336("X4@)r\u0007")), method5337(method5336("X4@){\u0007")), method5337(method5336("X4@)\u0004F;Hs\u0006\u0007")), method5337(method5336("X4@)~\u0007")), method5337(method5336("X4@)p\u0007")), method5337(method5336("X4@)t\u0007")), method5337(method5336("X4@)s\u0007"))};
   @OriginalMember(
      owner = "client!waa",
      name = "B",
      descriptor = "[I"
   )
   public static int[] field10718 = new int[5];
   @OriginalMember(
      owner = "client!waa",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10724 = new String[]{method5337(method5336("e4O")), method5337(method5336("i0C")), method5337(method5336("b4S")), method5337(method5336("n%S")), method5337(method5336("b4X")), method5337(method5336("e O")), method5337(method5336("e M")), method5337(method5336("n F")), method5337(method5336("|0Q")), method5337(method5336("`6U")), method5337(method5336("a:W")), method5337(method5336("k0B"))};
   @OriginalMember(
      owner = "client!waa",
      name = "s",
      descriptor = "I"
   )
   public static int field10716;
   @OriginalMember(
      owner = "client!waa",
      name = "o",
      descriptor = "I"
   )
   public static int field10720;
   @OriginalMember(
      owner = "client!waa",
      name = "y",
      descriptor = "I"
   )
   private int field10721;
   @OriginalMember(
      owner = "client!waa",
      name = "C",
      descriptor = "I"
   )
   public static int field10722;
   @OriginalMember(
      owner = "client!waa",
      name = "v",
      descriptor = "I"
   )
   public static int field10723;
   @OriginalMember(
      owner = "client!waa",
      name = "A",
      descriptor = "I"
   )
   public static int field10725;
   @OriginalMember(
      owner = "client!waa",
      name = "p",
      descriptor = "I"
   )
   public static int field10726;
   @OriginalMember(
      owner = "client!waa",
      name = "u",
      descriptor = "I"
   )
   private int field10727;
   @OriginalMember(
      owner = "client!waa",
      name = "x",
      descriptor = "I"
   )
   public static int field10728;
   @OriginalMember(
      owner = "client!waa",
      name = "t",
      descriptor = "I"
   )
   public static int field10730;
   @OriginalMember(
      owner = "client!waa",
      name = "q",
      descriptor = "I"
   )
   public static int field10731;
   @OriginalMember(
      owner = "client!waa",
      name = "n",
      descriptor = "I"
   )
   public static int field10732;
   @OriginalMember(
      owner = "client!waa",
      name = "r",
      descriptor = "Lvca;"
   )
   public static class296 field10729;
   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "[B"
   )
   private byte[] field10717;

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(BBI)V",
      line = 4
   )
   public void method397(byte arg0, byte arg1, int arg2) {
      try {
         this.field10717[this.field10727++] = (byte)(127 + class556.method3988(127, arg1 >> 1));
         if (arg0 >= 5) {
            ++field10726;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10733[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "([B[[BBII[I[[B[I)I",
      line = 16
   )
   public static final int method5331(byte[] arg0, byte[][] arg1, byte arg2, int arg3, int arg4, int[] arg5, byte[][] arg6, int[] arg7) {
      boolean var8 = client.field4360;

      try {
         if (arg2 != -3) {
            field10724 = null;
         }

         ++field10716;
         int var9 = arg7[arg4];
         int var10 = arg5[arg4] + var9;
         int var11 = arg7[arg3];
         int var12 = var11 - -arg5[arg3];
         int var13 = var9;
         if (var11 > var9) {
            var13 = var11;
         }

         int var14 = var10;
         if (~var12 > ~var10) {
            var14 = var12;
         }

         int var15 = arg0[arg4] & 255;
         if (~(arg0[arg3] & 255) > ~var15) {
            var15 = arg0[arg3] & 255;
         }

         byte[] var16 = arg1[arg4];
         byte[] var17 = arg6[arg3];
         int var18 = var13 - var9;
         int var19 = -var11 + var13;
         int var20 = var13;
         int var21;
         if (var8) {
            var21 = var17[var19++] + var16[var18++];
            if (var21 < var15) {
               var15 = var21;
            }

            var20 = var13 + 1;
         }

         while(true) {
            while(var14 > var20) {
               var21 = var17[var19++] + var16[var18++];
               if (var21 < var15) {
                  var15 = var21;
               }

               ++var20;
            }

            int var24 = -var15;
            if (!var8) {
               return var24;
            }

            var21 = var24;
            if (var21 < var15) {
               var15 = var21;
            }

            ++var20;
         }
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field10733[0] + (arg0 != null ? field10733[2] : field10733[1]) + ',' + (arg1 != null ? field10733[2] : field10733[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10733[2] : field10733[1]) + ',' + (arg6 != null ? field10733[2] : field10733[1]) + ',' + (arg7 != null ? field10733[2] : field10733[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(IZI)V",
      line = 74
   )
   public final void method21(int arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            this.field10721 += this.field10719[arg2] * arg0 >> 12;
            ++field10722;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10733[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "b",
      descriptor = "(I)V",
      line = 85
   )
   public final void method17(int arg0) {
      try {
         this.field10721 = Math.abs(this.field10721);
         if (arg0 > -68) {
            this.field10727 = -72;
         }

         ++field10720;
         if (~this.field10721 <= -4097) {
            this.field10721 = 4095;
         }

         this.method397((byte)91, (byte)(this.field10721 >> 4), this.field10727++);
         this.field10721 = 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10733[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(BLha;)V",
      line = 103
   )
   public static final void method5332(byte arg0, class66 arg1) {
      try {
         ++field10723;
         if (class715.field10406 != class564.field8045.field10701) {
            if (class663.field9659 != null) {
               if (class755.method5480(-80, class564.field8045.field10701, arg1)) {
                  class715.field10406 = class564.field8045.field10701;
               }

               int var2 = -110 % ((arg0 - 57) / 41);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10733[11] + arg0 + ',' + (arg1 != null ? field10733[2] : field10733[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(ZIZ)V",
      line = 123
   )
   public static final void method5333(boolean arg0, int arg1, boolean arg2) {
      try {
         if (arg2) {
            ++class778.field11399;
            class109.method885((byte)78);
         }

         if (arg1 != 127) {
            method5332((byte)48, (class66)null);
         }

         ++field10732;
         if (arg0) {
            ++class754.field11171;
            class60.method464(false);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10733[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "a",
      descriptor = "(Ljava/net/Socket;BI)Lne;",
      line = 154
   )
   public static final class338 method5334(Socket arg0, byte arg1, int arg2) throws IOException {
      try {
         ++field10725;
         if (arg1 > -105) {
            field10728 = 3;
         }

         return new class168(arg0, arg2);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10733[5] + (arg0 != null ? field10733[2] : field10733[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "e",
      descriptor = "(I)V",
      line = 165
   )
   public static void method5335(int arg0) {
      try {
         field10718 = null;
         field10729 = null;
         if (arg0 == 4096) {
            field10724 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10733[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "d",
      descriptor = "(I)V",
      line = 177
   )
   public final void method19(int arg0) {
      try {
         this.field10727 = arg0;
         this.field10721 = 0;
         ++field10731;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10733[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!waa",
      name = "<init>",
      descriptor = "(IIIIIF)V",
      line = 192
   )
   public class733(int param1, int param2, int param3, int param4, int param5, float param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5336(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!waa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5337(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
