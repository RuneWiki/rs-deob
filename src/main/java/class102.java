import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class102 extends class47 {
   @OriginalMember(
      owner = "client!ws",
      name = "B",
      descriptor = "Ljagtheora/vorbis/VorbisInfo;"
   )
   private VorbisInfo field1610;
   @OriginalMember(
      owner = "client!ws",
      name = "o",
      descriptor = "Ljagtheora/vorbis/VorbisComment;"
   )
   private VorbisComment field1612;
   @OriginalMember(
      owner = "client!ws",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1621 = new String[]{method1010(method1009("\u0013'4}_")), method1010(method1009("\u0006|v?")), method1010(method1009("\u001fz4\u0017\n")), method1010(method1009("\u001fz4oK\u0006`nm\n")), method1010(method1009("\ffy&O\rgn}A\u0007fq:GU+")), method1010(method1009("\u001dzh7M\n4")), method1010(method1009("\u000bfu8K\rau V")), method1010(method1009("\u001fz4\u0011\n")), method1010(method1009("S)l6P\u001b`u=\u001fY2:#C\u001ca'|\u0019Hmu>C\u0001g'")), method1010(method1009("\u001fz4\u0014\n")), method1010(method1009("\u001fz4\u0015\n")), method1010(method1009("\u001fz4\u0012\n")), method1010(method1009("\u001fz4\u001a\n")), method1010(method1009("\u001fz4\u0016\n")), method1010(method1009("\u001fz4\u0010\n")), method1010(method1009("\u001fz4\u001b\n"))};
   @OriginalMember(
      owner = "client!ws",
      name = "C",
      descriptor = "I"
   )
   public static int field1607 = 0;
   @OriginalMember(
      owner = "client!ws",
      name = "G",
      descriptor = "D"
   )
   private double field1616;
   @OriginalMember(
      owner = "client!ws",
      name = "w",
      descriptor = "I"
   )
   public static int field1603;
   @OriginalMember(
      owner = "client!ws",
      name = "q",
      descriptor = "I"
   )
   public static int field1604;
   @OriginalMember(
      owner = "client!ws",
      name = "D",
      descriptor = "I"
   )
   public static int field1605;
   @OriginalMember(
      owner = "client!ws",
      name = "r",
      descriptor = "I"
   )
   public static int field1606;
   @OriginalMember(
      owner = "client!ws",
      name = "H",
      descriptor = "I"
   )
   public static int field1608;
   @OriginalMember(
      owner = "client!ws",
      name = "A",
      descriptor = "I"
   )
   public static int field1609;
   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "I"
   )
   public static int field1613;
   @OriginalMember(
      owner = "client!ws",
      name = "s",
      descriptor = "I"
   )
   public static int field1614;
   @OriginalMember(
      owner = "client!ws",
      name = "p",
      descriptor = "I"
   )
   public static int field1617;
   @OriginalMember(
      owner = "client!ws",
      name = "E",
      descriptor = "I"
   )
   public static int field1618;
   @OriginalMember(
      owner = "client!ws",
      name = "u",
      descriptor = "I"
   )
   private int field1620;
   @OriginalMember(
      owner = "client!ws",
      name = "t",
      descriptor = "Lwe;"
   )
   private class195 field1611;
   @OriginalMember(
      owner = "client!ws",
      name = "x",
      descriptor = "Lgu;"
   )
   private class379 field1615;
   @OriginalMember(
      owner = "client!ws",
      name = "v",
      descriptor = "Ljagtheora/vorbis/DSPState;"
   )
   private DSPState field1602;
   @OriginalMember(
      owner = "client!ws",
      name = "y",
      descriptor = "Ljagtheora/vorbis/VorbisBlock;"
   )
   private VorbisBlock field1619;

   @OriginalMember(
      owner = "client!ws",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1002(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(IBII)I"
   )
   public static final int method1003(int arg0, byte arg1, int arg2, int arg3) {
      try {
         int var7 = arg0 & 3;
         ++field1613;
         if (var7 == 0) {
            return arg3;
         } else {
            int var4 = -111 % ((arg1 - -9) / 49);
            if (var7 == 1) {
               return arg2;
            } else {
               return ~var7 == -3 ? -arg3 + 7 : -arg2 + 7;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1621[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "b",
      descriptor = "(I)D"
   )
   public final double method1004(int arg0) {
      try {
         ++field1614;
         double var2 = this.field1616;
         if (this.field1615 != null) {
            var2 = this.field1615.method2956(arg0 + 81);
            if (var2 < 0.0D) {
               var2 = this.field1616;
            }
         }

         if (arg0 != 0) {
            method1002((byte)-109);
         }

         return (double)(-(256.0F / (float)class358.field5291)) + var2;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1621[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class102(OggStreamState arg0) {
      super(arg0);

      try {
         this.field1610 = new VorbisInfo();
         this.field1612 = new VorbisComment();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1621[3] + (arg0 != null ? field1621[0] : field1621[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1005(boolean arg0) {
      try {
         if (!arg0) {
            method1006(-124);
         }

         ++field1617;
         return this.field1615 != null ? this.field1615.method2953(!arg0) : 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1621[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method471(int arg0) {
      try {
         if (this.field1619 != null) {
            this.field1619.method4021();
         }

         ++field1618;
         if (arg0 != -1) {
            this.method468(12, (OggPacket)null);
         }

         if (this.field1602 != null) {
            this.field1602.method4021();
         }

         this.field1612.method4021();
         this.field1610.method4021();
         if (this.field1615 != null) {
            this.field1615.method2957(false);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1621[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method468(int arg0, OggPacket arg1) {
      boolean var3 = client.field10022;

      try {
         label82: {
            ++field1603;
            if (~super.field727 <= -4) {
               if (this.field1619.synthesis(arg1) == 0) {
                  this.field1602.blockIn(this.field1619);
               }

               float[][] var4 = this.field1602.pcmOut(this.field1610.channels);
               this.field1616 = this.field1602.granuleTime();
               if (this.field1616 == -1.0D) {
                  this.field1616 = (double)((float)this.field1620 / (float)this.field1610.rate);
               }

               this.field1602.read(var4[0].length);
               this.field1620 += var4[0].length;
               class269 var5 = this.field1615.method2955(var4[0].length, -19681, this.field1616);
               class266.method2275(var4, 4913, var5.field4124);
               int var6 = 0;
               if (var3) {
                  var5.field4124[var6] = this.field1611.method1712(var5.field4124[var6], 31654);
                  ++var6;
               }

               while(true) {
                  while(this.field1610.channels > var6) {
                     var5.field4124[var6] = this.field1611.method1712(var5.field4124[var6], 31654);
                     ++var6;
                  }

                  this.field1615.method2958(arg0 + 13413, var5);
                  if (!var3) {
                     if (!var3) {
                        break label82;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            int var7 = this.field1610.headerIn(this.field1612, arg1);
            if (var7 < 0) {
               throw new IllegalStateException(String.valueOf(var7));
            }

            if (~super.field727 == -3) {
               if (~this.field1610.channels < -3 || ~this.field1610.channels > -2) {
                  throw new RuntimeException(String.valueOf(this.field1610.channels));
               }

               this.field1602 = new DSPState(this.field1610);
               this.field1619 = new VorbisBlock(this.field1602);
               this.field1611 = new class195(this.field1610.rate, class358.field5291);
               this.field1615 = new class379(this.field1610.channels);
            }
         }

         if (arg0 != -13313) {
            method1003(15, (byte)118, 7, -68);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field1621[2] + arg0 + ',' + (arg1 != null ? field1621[0] : field1621[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method1006(int arg0) {
      try {
         ++field1604;
         if (class289.field4303 != null) {
            try {
               String var1 = class289.field4303.getParameter(field1621[6]);
               int var2 = -11745 + (int)(class604.method4452(-124) / 86400000L);
               if (arg0 != -10716) {
                  field1607 = 83;
               }

               String var3 = field1621[5] + var2 + field1621[8] + var1;
               class726.method5253(field1621[4] + var3 + "\"", class289.field4303, (byte)-106);
            } catch (Throwable var5) {
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1621[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "b",
      descriptor = "(Z)Lgu;"
   )
   public final class379 method1007(boolean arg0) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field1606;
            return this.field1615;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1621[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method1008(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field1609;
         if (arg0 != -16622) {
            method1003(-124, (byte)75, 89, 93);
         }

         if (arg5 >= class729.field10384 && class604.field8618 >= arg3 && class587.field8239 <= arg4 && ~arg1 >= ~class767.field11011) {
            if (arg6 == 1) {
               class122.method1212(arg3, true, arg4, arg5, arg1, arg2);
            } else {
               class755.method5455(arg2, arg0 ^ 16539, arg4, arg3, arg5, arg6, arg1);
            }
         } else if (~arg6 != -2) {
            class211.method1825(arg3, arg2, arg1, arg5, arg4, arg6, -22516);
         } else {
            class751.method5398(arg4, arg1, arg3, arg2, (byte)-112, arg5);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field1621[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1009(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1010(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
