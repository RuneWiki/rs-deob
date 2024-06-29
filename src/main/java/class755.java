import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class755 extends class76 {
   @OriginalMember(
      owner = "client!wn",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11193 = new String[]{method5487(method5486("\u0001g;6#")), method5487(method5486("\r';Zv")), method5487(method5486("\u0001g;0#")), method5487(method5486("\u0018o")), method5487(method5486("\u0018|y\u0018")), method5487(method5486("\u0001g;Hb\u0018`aJ#")), method5487(method5486("\u0001g;2#")), method5487(method5486("\u0001g;3#")), method5487(method5486("\u0001g;5#")), method5487(method5486("\u0001g;7#")), method5487(method5486("\u0001g;1#"))};
   @OriginalMember(
      owner = "client!wn",
      name = "K",
      descriptor = "I"
   )
   public static int field11185 = -1;
   @OriginalMember(
      owner = "client!wn",
      name = "H",
      descriptor = "I"
   )
   public static int field11180;
   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "I"
   )
   public int field11181;
   @OriginalMember(
      owner = "client!wn",
      name = "B",
      descriptor = "I"
   )
   public static int field11182;
   @OriginalMember(
      owner = "client!wn",
      name = "G",
      descriptor = "I"
   )
   public static int field11183;
   @OriginalMember(
      owner = "client!wn",
      name = "D",
      descriptor = "I"
   )
   public int field11184;
   @OriginalMember(
      owner = "client!wn",
      name = "E",
      descriptor = "I"
   )
   public int field11187;
   @OriginalMember(
      owner = "client!wn",
      name = "F",
      descriptor = "I"
   )
   public static int field11188;
   @OriginalMember(
      owner = "client!wn",
      name = "J",
      descriptor = "I"
   )
   public static int field11189;
   @OriginalMember(
      owner = "client!wn",
      name = "A",
      descriptor = "I"
   )
   public static int field11190;
   @OriginalMember(
      owner = "client!wn",
      name = "I",
      descriptor = "I"
   )
   public static int field11191;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!wn",
      name = "L",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11192;
   @OriginalMember(
      owner = "client!wn",
      name = "C",
      descriptor = "Ljava/lang/String;"
   )
   public String field11186;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method5485(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(Z[B)Lbg;",
      line = 5
   )
   public static final class492 method5478(boolean arg0, byte[] arg1) {
      try {
         ++field11180;
         if (!arg0) {
            return null;
         } else if (arg1 == null) {
            throw new RuntimeException("");
         } else {
            while(true) {
               try {
                  Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                  MediaTracker var3 = new MediaTracker(class220.field3148);
                  var3.addImage(var2, 0);
                  var3.waitForAll();
                  int var4 = var2.getWidth(class220.field3148);
                  int var5 = var2.getHeight(class220.field3148);
                  if (!var3.isErrorAny() && ~var4 <= -1 && ~var5 <= -1) {
                     int[] var6 = new int[var4 * var5];
                     PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                     var7.grabPixels();
                     return class383.field5543.method548(-19069, var5, var6, var4, var4, 0);
                  }

                  throw new RuntimeException("");
               } catch (InterruptedException var9) {
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field11193[8] + arg0 + ',' + (arg1 != null ? field11193[1] : field11193[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "g",
      descriptor = "(I)V",
      line = 46
   )
   public final void method5479(int arg0) {
      try {
         ++field11191;
         super.field947 |= Long.MIN_VALUE;
         if (arg0 == 1288) {
            if (~this.method5484(arg0 ^ -22) == -1L) {
               class308.field4242.method3486(this, 1779380172);
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11193[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(IILha;)Z",
      line = 62
   )
   public static final boolean method5480(int param0, int param1, class66 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wn",
      name = "d",
      descriptor = "(I)V",
      line = 507
   )
   public final void method5481(int arg0) {
      try {
         if (arg0 > -85) {
            this.method5482(-45);
         }

         ++field11188;
         super.field947 = Long.MIN_VALUE & super.field947 | 500L + class133.method1054(-29025);
         class635.field9281.method3486(this, 1779380172);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11193[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "a",
      descriptor = "(I)I",
      line = 520
   )
   public final int method5482(int arg0) {
      try {
         ++field11182;
         if (arg0 != 5985) {
            this.field11184 = 52;
         }

         return (int)(super.field6137 >>> 56 & 255L);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11193[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "c",
      descriptor = "(I)J",
      line = 533
   )
   public final long method5483(int arg0) {
      try {
         if (arg0 != -7455) {
            this.method5482(-112);
         }

         ++field11189;
         return 72057594037927935L & super.field6137;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11193[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "h",
      descriptor = "(I)J",
      line = 547
   )
   public final long method5484(int arg0) {
      try {
         if (arg0 != -1310) {
            return 73L;
         } else {
            ++field11190;
            return super.field947 & Long.MAX_VALUE;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11193[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "<init>",
      descriptor = "(IJ)V",
      line = 565
   )
   public class755(int arg0, long arg1) {
      try {
         super.field6137 = arg1 | (long)arg0 << 56;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11193[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5486(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5487(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
