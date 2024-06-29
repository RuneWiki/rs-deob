import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.vorbis.DSPState;
import jagtheora.vorbis.VorbisBlock;
import jagtheora.vorbis.VorbisComment;
import jagtheora.vorbis.VorbisInfo;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class562 extends class153 {
   @OriginalMember(
      owner = "client!rc",
      name = "A",
      descriptor = "Ljagtheora/vorbis/VorbisInfo;"
   )
   private VorbisInfo field8174;
   @OriginalMember(
      owner = "client!rc",
      name = "B",
      descriptor = "Ljagtheora/vorbis/VorbisComment;"
   )
   private VorbisComment field8180;
   @OriginalMember(
      owner = "client!rc",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8184 = new String[]{method4196(method4195("5\u001f?hx")), method4196(method4195("5\u001f?lx")), method4196(method4195("5\u001f?jx")), method4196(method4195("<R?\u0007-")), method4196(method4195(")\t}E")), method4196(method4195("5\u001f?\u00159)\u0015e\u0017x")), method4196(method4195("5\u001f?mx")), method4196(method4195("5\u001f?kx"))};
   @OriginalMember(
      owner = "client!rc",
      name = "D",
      descriptor = "D"
   )
   private double field8183;
   @OriginalMember(
      owner = "client!rc",
      name = "E",
      descriptor = "I"
   )
   public static int field8173;
   @OriginalMember(
      owner = "client!rc",
      name = "C",
      descriptor = "I"
   )
   public static int field8175;
   @OriginalMember(
      owner = "client!rc",
      name = "t",
      descriptor = "I"
   )
   public static int field8176;
   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "I"
   )
   public static int field8179;
   @OriginalMember(
      owner = "client!rc",
      name = "x",
      descriptor = "I"
   )
   public static int field8181;
   @OriginalMember(
      owner = "client!rc",
      name = "v",
      descriptor = "I"
   )
   private int field8182;
   @OriginalMember(
      owner = "client!rc",
      name = "s",
      descriptor = "Llf;"
   )
   private class247 field8171;
   @OriginalMember(
      owner = "client!rc",
      name = "w",
      descriptor = "Lkaa;"
   )
   private class51 field8177;
   @OriginalMember(
      owner = "client!rc",
      name = "u",
      descriptor = "Ljagtheora/vorbis/DSPState;"
   )
   private DSPState field8172;
   @OriginalMember(
      owner = "client!rc",
      name = "y",
      descriptor = "Ljagtheora/vorbis/VorbisBlock;"
   )
   private VorbisBlock field8178;

   @OriginalMember(
      owner = "client!rc",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method4192(int arg0) {
      try {
         if (arg0 != 0) {
            return -22;
         } else {
            ++field8173;
            return this.field8171 != null ? this.field8171.method2010((byte)-30) : 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8184[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1419(byte arg0) {
      try {
         if (arg0 < 65) {
            this.method4192(22);
         }

         ++field8176;
         if (this.field8178 != null) {
            this.field8178.method5341();
         }

         if (this.field8172 != null) {
            this.field8172.method5341();
         }

         this.field8180.method5341();
         this.field8174.method5341();
         if (this.field8171 != null) {
            this.field8171.method2007((byte)2);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8184[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "b",
      descriptor = "(Z)D"
   )
   public final double method4193(boolean arg0) {
      try {
         ++field8181;
         if (!arg0) {
            this.field8177 = null;
         }

         double var2 = this.field8183;
         if (this.field8171 != null) {
            var2 = this.field8171.method2009(0);
            if (var2 < 0.0D) {
               var2 = this.field8183;
            }
         }

         return var2 - (double)(256.0F / (float)class755.field10967);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8184[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class562(OggStreamState arg0) {
      super(arg0);

      try {
         this.field8174 = new VorbisInfo();
         this.field8180 = new VorbisComment();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8184[5] + (arg0 != null ? field8184[3] : field8184[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public final void method1418(OggPacket arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 > 92) {
            ++field8179;
            if (~super.field2443 > -4) {
               int var7 = this.field8174.headerIn(this.field8180, arg0);
               if (~var7 > -1) {
                  throw new IllegalStateException(String.valueOf(var7));
               } else if (~super.field2443 == -3) {
                  if (~this.field8174.channels >= -3 && ~this.field8174.channels <= -2) {
                     this.field8172 = new DSPState(this.field8174);
                     this.field8178 = new VorbisBlock(this.field8172);
                     this.field8177 = new class51(this.field8174.rate, class755.field10967);
                     this.field8171 = new class247(this.field8174.channels);
                  } else {
                     throw new RuntimeException(String.valueOf(this.field8174.channels));
                  }
               }
            } else {
               if (~this.field8178.synthesis(arg0) == -1) {
                  this.field8172.blockIn(this.field8178);
               }

               float[][] var4 = this.field8172.pcmOut(this.field8174.channels);
               this.field8183 = this.field8172.granuleTime();
               if (this.field8183 == -1.0D) {
                  this.field8183 = (double)((float)this.field8182 / (float)this.field8174.rate);
               }

               this.field8172.read(var4[0].length);
               this.field8182 += var4[0].length;
               class24 var5 = this.field8171.method2002(this.field8183, 0, var4[0].length);
               class581.method4280((byte)-108, var4, var5.field367);
               int var6 = 0;
               if (var3) {
                  var5.field367[var6] = this.field8177.method617(-100, var5.field367[var6]);
                  ++var6;
               }

               while(true) {
                  while(~var6 > ~this.field8174.channels) {
                     var5.field367[var6] = this.field8177.method617(-100, var5.field367[var6]);
                     ++var6;
                  }

                  this.field8171.method2004(var5, 31462);
                  if (!var3) {
                     return;
                  }

                  ++var6;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8184[7] + (arg0 != null ? field8184[3] : field8184[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "b",
      descriptor = "(I)Llf;"
   )
   public final class247 method4194(int arg0) {
      try {
         ++field8175;
         if (arg0 != -12988) {
            this.field8180 = null;
         }

         return this.field8171;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8184[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4195(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4196(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
