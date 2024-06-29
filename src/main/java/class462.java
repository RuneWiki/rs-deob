import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class462 {
   @OriginalMember(
      owner = "client!vr",
      name = "g",
      descriptor = "Lsia;"
   )
   private class407 field6362 = new class407(64);
   @OriginalMember(
      owner = "client!vr",
      name = "j",
      descriptor = "Lww;"
   )
   private class339 field6364;
   @OriginalMember(
      owner = "client!vr",
      name = "b",
      descriptor = "I"
   )
   public int field6365;
   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6372 = new String[]{method3528(method3527("I\u0018U ^")), method3528(method3527("I\u0018U%^")), method3528(method3527("Q\u001f\u0017\u000b")), method3528(method3527("DDUI\u000b")), method3528(method3527("I\u0018U\"^")), method3528(method3527("I\u0018U[\u001fQ\u0003\u000fY^")), method3528(method3527("I\u0018U!^")), method3528(method3527("I\u0018U#^")), method3528(method3527("I\u0018U$^")), method3528(method3527("I\u0018U&^"))};
   @OriginalMember(
      owner = "client!vr",
      name = "i",
      descriptor = "Laka;"
   )
   public static class418 field6371 = new class418(139, 0);
   @OriginalMember(
      owner = "client!vr",
      name = "d",
      descriptor = "I"
   )
   public static int field6363;
   @OriginalMember(
      owner = "client!vr",
      name = "f",
      descriptor = "I"
   )
   public static int field6366;
   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "I"
   )
   public static int field6367;
   @OriginalMember(
      owner = "client!vr",
      name = "e",
      descriptor = "I"
   )
   public static int field6368;
   @OriginalMember(
      owner = "client!vr",
      name = "c",
      descriptor = "I"
   )
   public static int field6369;
   @OriginalMember(
      owner = "client!vr",
      name = "h",
      descriptor = "I"
   )
   public static int field6370;

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(IIIIIIZ)V"
   )
   public static final void method3520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      try {
         if (arg4 != 4631) {
            method3526(47);
         }

         class565.field8322 = arg5;
         class570.field8380 = arg0;
         class523.field7334 = arg1;
         class567.field8342 = arg2;
         ++field6370;
         class158.field2030 = arg3;
         if (arg6 && ~class158.field2030 <= -101) {
            class168.field2195 = class565.field8322 * 512 - -256;
            class160.field2051 = class567.field8342 * 512 - -256;
            class546.field8031 = class215.method1757(class160.field2051, false, class674.field9984, class168.field2195) + -class523.field7334;
         }

         class574.field8442 = -1;
         class81.field1137 = -1;
         class784.field11454 = 2;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6372[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3521(byte arg0) {
      try {
         if (arg0 != -68) {
            this.method3523(-109, 15);
         }

         class407 var2 = this.field6362;
         synchronized(this.field6362) {
            this.field6362.method3187(-23825);
         }

         ++field6368;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6372[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "([BZ)Lpd;"
   )
   public static final class648 method3522(byte[] arg0, boolean arg1) {
      try {
         ++field6369;
         if (arg0 == null) {
            throw new RuntimeException("");
         } else {
            if (arg1) {
               field6371 = null;
            }

            while(true) {
               try {
                  Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                  MediaTracker var3 = new MediaTracker(class107.field1426);
                  var3.addImage(var2, 0);
                  var3.waitForAll();
                  int var4 = var2.getWidth(class107.field1426);
                  int var5 = var2.getHeight(class107.field1426);
                  if (!var3.isErrorAny() && ~var4 <= -1 && ~var5 <= -1) {
                     int[] var6 = new int[var4 * var5];
                     PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                     var7.grabPixels();
                     return class629.field9294.method3638(var4, -99, var6, var5, var4, 0);
                  }

                  throw new RuntimeException("");
               } catch (InterruptedException var9) {
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field6372[4] + (arg0 != null ? field6372[3] : field6372[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3523(int arg0, int arg1) {
      try {
         int var3 = 94 % ((-52 - arg1) / 54);
         class407 var4 = this.field6362;
         synchronized(this.field6362) {
            this.field6362.method3197(5, arg0);
         }

         ++field6366;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6372[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(IZ)Lo;"
   )
   public final class209 method3524(int arg0, boolean arg1) {
      try {
         ++field6367;
         class407 var3 = this.field6362;
         class209 var4;
         synchronized(this.field6362) {
            var4 = (class209)this.field6362.method3192((long)arg0, (byte)-115);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field6364;
            byte[] var6;
            synchronized(this.field6364) {
               var6 = this.field6364.method2697(arg0, 16, !arg1);
            }

            if (!arg1) {
               return null;
            } else {
               class209 var7 = new class209();
               if (var6 != null) {
                  var7.method1724(-2217, new class66(var6));
               }

               class407 var8 = this.field6362;
               synchronized(this.field6362) {
                  this.field6362.method3190(var7, (long)arg0, 8);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field6372[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3525(byte arg0) {
      try {
         if (arg0 != 105) {
            this.method3523(-69, -56);
         }

         class407 var2 = this.field6362;
         synchronized(this.field6362) {
            this.field6362.method3201((byte)-4);
         }

         ++field6363;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6372[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class462(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field6364 = arg2;
         if (this.field6364 != null) {
            this.field6365 = this.field6364.method2691(16, 119);
         } else {
            this.field6365 = 0;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6372[5] + (arg0 != null ? field6372[3] : field6372[2]) + ',' + arg1 + ',' + (arg2 != null ? field6372[3] : field6372[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3526(int arg0) {
      try {
         field6371 = null;
         if (arg0 != 16) {
            method3522((byte[])null, true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6372[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3527(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3528(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
