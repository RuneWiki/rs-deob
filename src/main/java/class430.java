import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class430 extends class537 {
   @OriginalMember(
      owner = "client!rm",
      name = "u",
      descriptor = "Ljagtheora/theora/SetupInfo;"
   )
   private SetupInfo field6571;
   @OriginalMember(
      owner = "client!rm",
      name = "N",
      descriptor = "Ljagtheora/theora/TheoraInfo;"
   )
   private TheoraInfo field6565;
   @OriginalMember(
      owner = "client!rm",
      name = "t",
      descriptor = "Ljagtheora/theora/TheoraComment;"
   )
   private TheoraComment field6564;
   @OriginalMember(
      owner = "client!rm",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6584 = new String[]{method3281(method3280("?\u0018g?u")), method3281(method3280("*C%}")), method3281(method3280("6[g-a*_=/ ")), method3281(method3280("6[gS ")), method3281(method3280("6[gY ")), method3281(method3280("6[gX ")), method3281(method3280("6[gU ")), method3281(method3280("6[gV ")), method3281(method3280("6[gT ")), method3281(method3280("6[gW ")), method3281(method3280("6[gP ")), method3281(method3280("6[gR "))};
   @OriginalMember(
      owner = "client!rm",
      name = "R",
      descriptor = "Lkh;"
   )
   public static class17 field6572 = new class17(0, 0);
   @OriginalMember(
      owner = "client!rm",
      name = "A",
      descriptor = "[J"
   )
   public static long[] field6580 = new long[32];
   @OriginalMember(
      owner = "client!rm",
      name = "H",
      descriptor = "I"
   )
   public static int field6583 = 0;
   @OriginalMember(
      owner = "client!rm",
      name = "K",
      descriptor = "D"
   )
   private double field6582;
   @OriginalMember(
      owner = "client!rm",
      name = "M",
      descriptor = "I"
   )
   public static int field6557;
   @OriginalMember(
      owner = "client!rm",
      name = "r",
      descriptor = "I"
   )
   public static int field6561;
   @OriginalMember(
      owner = "client!rm",
      name = "G",
      descriptor = "I"
   )
   public static int field6563;
   @OriginalMember(
      owner = "client!rm",
      name = "B",
      descriptor = "I"
   )
   public static int field6566;
   @OriginalMember(
      owner = "client!rm",
      name = "O",
      descriptor = "I"
   )
   private int field6567;
   @OriginalMember(
      owner = "client!rm",
      name = "L",
      descriptor = "I"
   )
   public static int field6569;
   @OriginalMember(
      owner = "client!rm",
      name = "D",
      descriptor = "I"
   )
   private int field6570;
   @OriginalMember(
      owner = "client!rm",
      name = "P",
      descriptor = "I"
   )
   public static int field6573;
   @OriginalMember(
      owner = "client!rm",
      name = "I",
      descriptor = "I"
   )
   public static int field6575;
   @OriginalMember(
      owner = "client!rm",
      name = "v",
      descriptor = "I"
   )
   public static int field6579;
   @OriginalMember(
      owner = "client!rm",
      name = "s",
      descriptor = "I"
   )
   public static int field6581;
   @OriginalMember(
      owner = "client!rm",
      name = "w",
      descriptor = "J"
   )
   private long field6558;
   @OriginalMember(
      owner = "client!rm",
      name = "y",
      descriptor = "Lat;"
   )
   private class396 field6562;
   @OriginalMember(
      owner = "client!rm",
      name = "E",
      descriptor = "Ljagtheora/theora/DecoderContext;"
   )
   private DecoderContext field6578;
   @OriginalMember(
      owner = "client!rm",
      name = "F",
      descriptor = "Ljagtheora/theora/Frame;"
   )
   private Frame field6559;
   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "Ljagtheora/theora/GranulePos;"
   )
   private GranulePos field6560;
   @OriginalMember(
      owner = "client!rm",
      name = "J",
      descriptor = "Z"
   )
   private boolean field6568;
   @OriginalMember(
      owner = "client!rm",
      name = "C",
      descriptor = "Z"
   )
   private boolean field6574;
   @OriginalMember(
      owner = "client!rm",
      name = "Q",
      descriptor = "Z"
   )
   private boolean field6576;
   @OriginalMember(
      owner = "client!rm",
      name = "x",
      descriptor = "Z"
   )
   private boolean field6577;

   @OriginalMember(
      owner = "client!rm",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method3273(int arg0) {
      try {
         if (arg0 != -2049) {
            return false;
         } else {
            ++field6575;
            return this.field6568;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6584[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class430(OggStreamState arg0) {
      super(arg0);

      try {
         this.field6571 = new SetupInfo();
         this.field6565 = new TheoraInfo();
         this.field6564 = new TheoraComment();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6584[2] + (arg0 != null ? field6584[0] : field6584[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(Lha;I)Lat;"
   )
   public final class396 method3274(class66 arg0, int arg1) {
      try {
         if (arg1 != 28124) {
            this.method3277(false);
         }

         ++field6579;
         if (this.field6559 == null) {
            return null;
         } else if (!this.field6577 && this.field6562 != null) {
            return this.field6562;
         } else {
            this.field6562 = arg0.method603(this.field6559.pixels, 0, this.field6559.field11005, this.field6559.field11005, this.field6559.field11004, false);
            this.field6577 = false;
            return this.field6562;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6584[10] + (arg0 != null ? field6584[0] : field6584[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method1468(OggPacket arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.method3279(-7, 75);
         }

         ++field6561;
         if (this.field6568) {
            this.field6558 = class188.method1462(true);
            int var3 = this.field6578.decodePacketIn(arg0, this.field6560);
            if (var3 < 0) {
               throw new IllegalStateException(String.valueOf(var3));
            } else {
               this.field6578.granuleFrame(this.field6560);
               this.field6582 = this.field6578.granuleTime(this.field6560);
               if (this.field6576) {
                  label81: {
                     boolean var4 = arg0.isKeyFrame() == 1;
                     if (var4) {
                        this.field6576 = false;
                        if (client.field4530 == 0) {
                           break label81;
                        }
                     }

                     return;
                  }
               }

               if (!this.field6574 || arg0.isKeyFrame() == 1) {
                  if (this.field6578.decodeFrame(this.field6559) != 0) {
                     throw new IllegalStateException(String.valueOf(var3));
                  }

                  this.field6577 = true;
               }

            }
         } else {
            int var5 = this.field6571.decodeHeader(this.field6565, this.field6564, arg0);
            if (~var5 == -1) {
               this.field6568 = true;
               if (~this.field6565.frameWidth >= -2049 && ~this.field6565.frameHeight >= -1025) {
                  this.field6578 = new DecoderContext(this.field6565, this.field6571);
                  this.field6560 = new GranulePos();
                  this.field6559 = new Frame(this.field6565.frameWidth, this.field6565.frameHeight);
                  this.field6570 = this.field6578.getMaxPostProcessingLevel();
                  this.method3279(this.field6567, arg1 ^ -128);
               } else {
                  throw new IllegalStateException();
               }
            } else if (~var5 > -1) {
               throw new IllegalStateException(String.valueOf(var5));
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6584[8] + (arg0 != null ? field6584[0] : field6584[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "g",
      descriptor = "(I)F"
   )
   public final float method3275(int arg0) {
      try {
         if (arg0 != 0) {
            this.method3277(false);
         }

         ++field6573;
         return this.field6568 && !this.field6565.method5404() ? (float)this.field6565.fpsNumerator / (float)this.field6565.fpsDenominator : 0.0F;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6584[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method3276(byte arg0) {
      try {
         if (arg0 <= 17) {
            return -107L;
         } else {
            ++field6557;
            return this.field6558;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6584[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(Z)D"
   )
   public final double method3277(boolean arg0) {
      try {
         if (arg0) {
            return 0.4999938052226633D;
         } else {
            ++field6563;
            return this.field6582;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6584[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1467(int arg0) {
      try {
         ++field6566;
         if (this.field6559 != null) {
            this.field6559.method5403();
         }

         if (arg0 != -25083) {
            field6583 = 63;
         }

         if (this.field6578 != null) {
            this.field6578.method5403();
            this.field6578 = null;
         }

         if (this.field6560 != null) {
            this.field6560.method5403();
            this.field6560 = null;
         }

         this.field6565.method5403();
         this.field6564.method5403();
         this.field6571.method5403();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6584[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3278(int arg0) {
      try {
         field6572 = null;
         field6580 = null;
         if (arg0 != -17938) {
            field6572 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6584[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method3279(int arg0, int arg1) {
      try {
         if (arg1 > -111) {
            this.field6560 = null;
         }

         ++field6569;
         this.field6567 = arg0;
         if (this.field6568) {
            if (this.field6570 < this.field6567) {
               this.field6567 = this.field6570;
            }

            if (this.field6567 < 0) {
               this.field6567 = 0;
            }

            this.field6578.setPostProcessingLevel(this.field6567);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6584[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3280(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3281(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
