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

@OriginalClass("client!kq")
public class class40 extends class47 {
   @OriginalMember(
      owner = "client!kq",
      name = "L",
      descriptor = "Ljagtheora/theora/SetupInfo;"
   )
   private SetupInfo field605;
   @OriginalMember(
      owner = "client!kq",
      name = "s",
      descriptor = "Ljagtheora/theora/TheoraInfo;"
   )
   private TheoraInfo field618;
   @OriginalMember(
      owner = "client!kq",
      name = "D",
      descriptor = "Ljagtheora/theora/TheoraComment;"
   )
   private TheoraComment field602;
   @OriginalMember(
      owner = "client!kq",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field628 = new String[]{method479(method478("rm\u000b-\u001f")), method479(method478("rm\u000b*\u001f")), method479(method478("rm\u000b+\u001f")), method479(method478("rm\u000b\"\u001f")), method479(method478("wiI\u0000")), method479(method478("b2\u000bBJ")), method479(method478("rm\u000bP^wuQR\u001f")), method479(method478("rm\u000b.\u001f")), method479(method478("rm\u000b)\u001f")), method479(method478("rm\u000b(\u001f")), method479(method478("rm\u000b$\u001f")), method479(method478("rm\u000b%\u001f")), method479(method478("rm\u000b/\u001f"))};
   @OriginalMember(
      owner = "client!kq",
      name = "G",
      descriptor = "Lvf;"
   )
   public static class73 field606 = new class73();
   @OriginalMember(
      owner = "client!kq",
      name = "t",
      descriptor = "D"
   )
   private double field615;
   @OriginalMember(
      owner = "client!kq",
      name = "B",
      descriptor = "I"
   )
   public static int field609;
   @OriginalMember(
      owner = "client!kq",
      name = "F",
      descriptor = "I"
   )
   public static int field610;
   @OriginalMember(
      owner = "client!kq",
      name = "K",
      descriptor = "I"
   )
   private int field611;
   @OriginalMember(
      owner = "client!kq",
      name = "x",
      descriptor = "I"
   )
   public static int field613;
   @OriginalMember(
      owner = "client!kq",
      name = "M",
      descriptor = "I"
   )
   public static int field616;
   @OriginalMember(
      owner = "client!kq",
      name = "q",
      descriptor = "I"
   )
   public static int field617;
   @OriginalMember(
      owner = "client!kq",
      name = "C",
      descriptor = "I"
   )
   private int field619;
   @OriginalMember(
      owner = "client!kq",
      name = "u",
      descriptor = "I"
   )
   public static int field621;
   @OriginalMember(
      owner = "client!kq",
      name = "v",
      descriptor = "I"
   )
   public static int field622;
   @OriginalMember(
      owner = "client!kq",
      name = "r",
      descriptor = "I"
   )
   public static int field623;
   @OriginalMember(
      owner = "client!kq",
      name = "N",
      descriptor = "I"
   )
   public static int field624;
   @OriginalMember(
      owner = "client!kq",
      name = "A",
      descriptor = "I"
   )
   public static int field626;
   @OriginalMember(
      owner = "client!kq",
      name = "w",
      descriptor = "J"
   )
   private long field604;
   @OriginalMember(
      owner = "client!kq",
      name = "H",
      descriptor = "Lma;"
   )
   private class148 field607;
   @OriginalMember(
      owner = "client!kq",
      name = "E",
      descriptor = "Ljagtheora/theora/DecoderContext;"
   )
   private DecoderContext field627;
   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "Ljagtheora/theora/Frame;"
   )
   private Frame field625;
   @OriginalMember(
      owner = "client!kq",
      name = "I",
      descriptor = "Ljagtheora/theora/GranulePos;"
   )
   private GranulePos field608;
   @OriginalMember(
      owner = "client!kq",
      name = "J",
      descriptor = "Z"
   )
   private boolean field603;
   @OriginalMember(
      owner = "client!kq",
      name = "o",
      descriptor = "Z"
   )
   private boolean field612;
   @OriginalMember(
      owner = "client!kq",
      name = "y",
      descriptor = "Z"
   )
   private boolean field614;
   @OriginalMember(
      owner = "client!kq",
      name = "p",
      descriptor = "Z"
   )
   private boolean field620;

   @OriginalMember(
      owner = "client!kq",
      name = "g",
      descriptor = "(I)D"
   )
   public final double method467(int arg0) {
      try {
         if (arg0 != 3) {
            this.method468(-8, (OggPacket)null);
         }

         ++field621;
         return this.field615;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field628[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method468(int arg0, OggPacket arg1) {
      try {
         ++field613;
         if (arg0 != -13313) {
            this.method470(71);
         }

         if (!this.field612) {
            int var3 = this.field605.decodeHeader(this.field618, this.field602, arg1);
            if (var3 != 0) {
               if (var3 < 0) {
                  throw new IllegalStateException(String.valueOf(var3));
               }
            } else {
               this.field612 = true;
               if (this.field618.frameWidth > 2048 || this.field618.frameHeight > 1024) {
                  throw new IllegalStateException();
               }

               this.field627 = new DecoderContext(this.field618, this.field605);
               this.field608 = new GranulePos();
               this.field625 = new Frame(this.field618.frameWidth, this.field618.frameHeight);
               this.field611 = this.field627.getMaxPostProcessingLevel();
               this.method474(this.field619, (byte)-68);
            }

         } else {
            this.field604 = class604.method4452(arg0 ^ -13326);
            int var4 = this.field627.decodePacketIn(arg1, this.field608);
            if (var4 < 0) {
               throw new IllegalStateException(String.valueOf(var4));
            } else {
               this.field627.granuleFrame(this.field608);
               this.field615 = this.field627.granuleTime(this.field608);
               if (this.field620) {
                  boolean var5 = ~arg1.isKeyFrame() == -2;
                  if (!var5) {
                     return;
                  }

                  this.field620 = false;
               }

               if (!this.field603 || ~arg1.isKeyFrame() == -2) {
                  if (this.field627.decodeFrame(this.field625) != 0) {
                     throw new IllegalStateException(String.valueOf(var4));
                  }

                  this.field614 = true;
               }

            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field628[9] + arg0 + ',' + (arg1 != null ? field628[5] : field628[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "e",
      descriptor = "(I)F"
   )
   public final float method469(int arg0) {
      try {
         if (arg0 != 1) {
            this.method467(6);
         }

         ++field609;
         return this.field612 && !this.field618.method4020() ? (float)this.field618.fpsNumerator / (float)this.field618.fpsDenominator : 0.0F;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field628[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "f",
      descriptor = "(I)J"
   )
   public final long method470(int arg0) {
      try {
         if (arg0 != -1) {
            return 125L;
         } else {
            ++field610;
            return this.field604;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field628[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method471(int arg0) {
      try {
         ++field617;
         if (this.field625 != null) {
            this.field625.method4021();
         }

         if (arg0 != -1) {
            this.method473((byte)72);
         }

         if (this.field627 != null) {
            this.field627.method4021();
            this.field627 = null;
         }

         if (this.field608 != null) {
            this.field608.method4021();
            this.field608 = null;
         }

         this.field618.method4021();
         this.field602.method4021();
         this.field605.method4021();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field628[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(Lha;B)Lma;"
   )
   public final class148 method472(class17 arg0, byte arg1) {
      try {
         int var3 = -109 % ((arg1 - -8) / 43);
         ++field616;
         if (this.field625 == null) {
            return null;
         } else if (!this.field614 && this.field607 != null) {
            return this.field607;
         } else {
            this.field607 = arg0.method219(this.field625.pixels, 0, this.field625.field7575, this.field625.field7575, this.field625.field7576, false);
            this.field614 = false;
            return this.field607;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field628[8] + (arg0 != null ? field628[5] : field628[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class40(OggStreamState arg0) {
      super(arg0);

      try {
         this.field605 = new SetupInfo();
         this.field618 = new TheoraInfo();
         this.field602 = new TheoraComment();
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field628[6] + (arg0 != null ? field628[5] : field628[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method473(byte arg0) {
      try {
         ++field624;
         if (arg0 != -88) {
            this.field608 = null;
         }

         return this.field612;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field628[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(IB)V"
   )
   private final void method474(int arg0, byte arg1) {
      try {
         if (arg1 > -10) {
            method475(-64);
         }

         this.field619 = arg0;
         ++field623;
         if (this.field612) {
            if (this.field619 > this.field611) {
               this.field619 = this.field611;
            }

            if (~this.field619 > -1) {
               this.field619 = 0;
            }

            this.field627.setPostProcessingLevel(this.field619);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field628[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method475(int arg0) {
      try {
         field606 = null;
         if (arg0 != 3) {
            field622 = -94;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field628[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(III)Lqu;"
   )
   public static final class84 method476(int arg0, int arg1, int arg2) {
      class312 var3 = class324.field4826[arg0][arg1][arg2];
      return var3 == null ? null : var3.field4678;
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(Z)I"
   )
   public static final int method477(boolean arg0) {
      try {
         ++field626;
         if (class687.field9907 != null) {
            return 3;
         } else {
            if (arg0) {
               field606 = null;
            }

            return !class7.field131 ? 1 : 2;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field628[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method478(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method479(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
