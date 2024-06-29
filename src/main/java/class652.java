import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class652 extends class409 {
   @OriginalMember(
      owner = "client!ab",
      name = "B",
      descriptor = "Ljagtheora/vorbis/VorbisInfo;"
   )
   private VorbisInfo field9736;
   @OriginalMember(
      owner = "client!ab",
      name = "w",
      descriptor = "Ljagtheora/vorbis/VorbisComment;"
   )
   private VorbisComment field9731;
   @OriginalMember(
      owner = "client!ab",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9743 = new String[]{method4794(method4793("ET6{\n")), method4794(method4793("ET6y\n")), method4794(method4793("ET6}\n")), method4794(method4793("ET6z\n")), method4794(method4793("_\u00186\u0016_")), method4794(method4793("ET6~\n")), method4794(method4793("JCtT")), method4794(method4793("ET6|\n")), method4794(method4793("ET6\u0004KJ_l\u0006\n"))};
   @OriginalMember(
      owner = "client!ab",
      name = "A",
      descriptor = "Ll;"
   )
   public static class292 field9738 = new class292("", 14);
   @OriginalMember(
      owner = "client!ab",
      name = "s",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field9740 = Calendar.getInstance(TimeZone.getTimeZone(method4794(method4793("c{L"))));
   @OriginalMember(
      owner = "client!ab",
      name = "v",
      descriptor = "Z"
   )
   public static boolean field9742 = false;
   @OriginalMember(
      owner = "client!ab",
      name = "G",
      descriptor = "D"
   )
   private double field9733;
   @OriginalMember(
      owner = "client!ab",
      name = "x",
      descriptor = "I"
   )
   public static int field9726;
   @OriginalMember(
      owner = "client!ab",
      name = "F",
      descriptor = "I"
   )
   public static int field9730;
   @OriginalMember(
      owner = "client!ab",
      name = "I",
      descriptor = "I"
   )
   public static int field9732;
   @OriginalMember(
      owner = "client!ab",
      name = "r",
      descriptor = "I"
   )
   public static int field9734;
   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "I"
   )
   public static int field9735;
   @OriginalMember(
      owner = "client!ab",
      name = "t",
      descriptor = "I"
   )
   private int field9739;
   @OriginalMember(
      owner = "client!ab",
      name = "D",
      descriptor = "J"
   )
   public static long field9741;
   @OriginalMember(
      owner = "client!ab",
      name = "J",
      descriptor = "Ltf;"
   )
   private class246 field9727;
   @OriginalMember(
      owner = "client!ab",
      name = "C",
      descriptor = "Lul;"
   )
   private class491 field9737;
   @OriginalMember(
      owner = "client!ab",
      name = "u",
      descriptor = "Ljagtheora/vorbis/DSPState;"
   )
   private DSPState field9729;
   @OriginalMember(
      owner = "client!ab",
      name = "y",
      descriptor = "Ljagtheora/vorbis/VorbisBlock;"
   )
   private VorbisBlock field9728;

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(IIILpf;Lpf;)V"
   )
   public static final void method4788(int arg0, int arg1, int arg2, class30 arg3, class30 arg4) {
      class731 var5 = class254.method2039(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field10656 = arg3;
         var5.field10642 = arg4;
         int var6 = class659.field9815 == class569.field8364 ? 1 : 0;
         if (arg3.method69((byte)70)) {
            if (arg3.method67(703)) {
               arg3.field10469 = class217.field2753[var6];
               class217.field2753[var6] = arg3;
            } else {
               arg3.field10469 = class127.field1637[var6];
               class127.field1637[var6] = arg3;
               class323.field4420 = true;
            }
         } else {
            arg3.field10469 = class500.field6970[var6];
            class500.field6970[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method69((byte)107)) {
               if (arg4.method67(703)) {
                  arg4.field10469 = class217.field2753[var6];
                  class217.field2753[var6] = arg4;
                  return;
               }

               arg4.field10469 = class127.field1637[var6];
               class127.field1637[var6] = arg4;
               class323.field4420 = true;
               return;
            }

            arg4.field10469 = class500.field6970[var6];
            class500.field6970[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method1015(int arg0, OggPacket arg1) {
      boolean var3 = client.field1481;

      try {
         ++field9732;
         if (arg0 == 0) {
            if (super.field5640 < 3) {
               int var7 = this.field9736.headerIn(this.field9731, arg1);
               if (var7 < 0) {
                  throw new IllegalStateException(String.valueOf(var7));
               } else if (super.field5640 == 2) {
                  if (~this.field9736.channels >= -3 && this.field9736.channels >= 1) {
                     this.field9729 = new DSPState(this.field9736);
                     this.field9728 = new VorbisBlock(this.field9729);
                     this.field9737 = new class491(this.field9736.rate, class36.field514);
                     this.field9727 = new class246(this.field9736.channels);
                  } else {
                     throw new RuntimeException(String.valueOf(this.field9736.channels));
                  }
               }
            } else {
               if (this.field9728.synthesis(arg1) == 0) {
                  this.field9729.blockIn(this.field9728);
               }

               float[][] var4 = this.field9729.pcmOut(this.field9736.channels);
               this.field9733 = this.field9729.granuleTime();
               if (this.field9733 == -1.0D) {
                  this.field9733 = (double)((float)this.field9739 / (float)this.field9736.rate);
               }

               this.field9729.read(var4[0].length);
               this.field9739 += var4[0].length;
               class123 var5 = this.field9727.method1957((byte)109, this.field9733, var4[0].length);
               class429.method3317(var5.field1615, (byte)124, var4);
               int var6 = 0;
               if (var3) {
                  var5.field1615[var6] = this.field9737.method3734(var5.field1615[var6], true);
                  ++var6;
               }

               while(true) {
                  while(~var6 > ~this.field9736.channels) {
                     var5.field1615[var6] = this.field9737.method3734(var5.field1615[var6], true);
                     ++var6;
                  }

                  this.field9727.method1951(var5, (byte)107);
                  if (!var3) {
                     return;
                  }

                  ++var6;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field9743[5] + arg0 + ',' + (arg1 != null ? field9743[4] : field9743[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method4789(int arg0) {
      try {
         field9740 = null;
         if (arg0 != 0) {
            method4789(-94);
         }

         field9738 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9743[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "c",
      descriptor = "(I)Ltf;"
   )
   public final class246 method4790(int arg0) {
      try {
         ++field9726;
         if (arg0 != -2985) {
            this.field9739 = 58;
         }

         return this.field9727;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9743[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "d",
      descriptor = "(I)D"
   )
   public final double method4791(int arg0) {
      try {
         if (arg0 <= 116) {
            return -1.30526564375006D;
         } else {
            ++field9730;
            double var2 = this.field9733;
            if (this.field9727 != null) {
               var2 = this.field9727.method1958(-6639);
               if (var2 < 0.0D) {
                  var2 = this.field9733;
               }
            }

            return var2 - (double)(256.0F / (float)class36.field514);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9743[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1017(int arg0) {
      try {
         if (arg0 > -126) {
            this.method4791(-43);
         }

         if (this.field9728 != null) {
            this.field9728.method1219();
         }

         ++field9735;
         if (this.field9729 != null) {
            this.field9729.method1219();
         }

         this.field9731.method1219();
         this.field9736.method1219();
         if (this.field9727 != null) {
            this.field9727.method1956(true);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9743[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class652(OggStreamState arg0) {
      super(arg0);

      try {
         this.field9736 = new VorbisInfo();
         this.field9731 = new VorbisComment();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9743[8] + (arg0 != null ? field9743[4] : field9743[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method4792(byte arg0) {
      try {
         int var2 = 118 / ((73 - arg0) / 37);
         ++field9734;
         return this.field9727 != null ? this.field9727.method1962(256) : 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9743[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4793(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ab",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4794(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
