import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class28 implements Runnable {
   @OriginalMember(
      owner = "client!ir",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field354 = new String[]{method237(method236("/\u0016\u0001\u0002e")), method237(method236(".\u0010[1wiK")), method237(method236("i\nJ6>h\u0013\\~*'\tJ|")), method237(method236("/\u0016\u0001\u0000e")), method237(method236("/\u0016\u0001\u0005e")), method237(method236("/\u0016\u000138(L")), method237(method236("/\u0016\u0001\u0003e"))};
   @OriginalMember(
      owner = "client!ir",
      name = "h",
      descriptor = "D"
   )
   public static double field348;
   @OriginalMember(
      owner = "client!ir",
      name = "i",
      descriptor = "I"
   )
   public static int field345;
   @OriginalMember(
      owner = "client!ir",
      name = "k",
      descriptor = "I"
   )
   public static int field346;
   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "I"
   )
   public static int field349;
   @OriginalMember(
      owner = "client!ir",
      name = "f",
      descriptor = "I"
   )
   public static int field350;
   @OriginalMember(
      owner = "client!ir",
      name = "g",
      descriptor = "I"
   )
   public static int field353;
   @OriginalMember(
      owner = "client!ir",
      name = "e",
      descriptor = "Lvea;"
   )
   private class289 field351;
   @OriginalMember(
      owner = "client!ir",
      name = "d",
      descriptor = "Lpg;"
   )
   public static class766 field352;
   @OriginalMember(
      owner = "client!ir",
      name = "c",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field344;
   @OriginalMember(
      owner = "client!ir",
      name = "b",
      descriptor = "Z"
   )
   private volatile boolean field343;
   @OriginalMember(
      owner = "client!ir",
      name = "j",
      descriptor = "[Lkba;"
   )
   private class114[] field347;

   @OriginalMember(
      owner = "client!ir",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method232(int arg0) {
      try {
         ++field353;
         if (this.field343) {
            return true;
         } else {
            int var2 = -95 % ((arg0 - -36) / 52);
            if (this.field351 == null) {
               try {
                  int var3 = class304.field4027 != class269.field3480 ? class85.field1100.field6242 + 7000 : 80;
                  this.field351 = class61.field671.method1941(new URL(field354[1] + class85.field1100.field6244 + ":" + var3 + field354[2] + class381.field5334.field333), false);
               } catch (MalformedURLException var5) {
                  return true;
               }
            }

            if (this.field351 != null && this.field351.field3826 != 2) {
               if (~this.field351.field3826 != -2) {
                  return false;
               } else {
                  if (this.field344 == null) {
                     this.field344 = new Thread(this);
                     this.field344.start();
                  }

                  return this.field343;
               }
            } else {
               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field354[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method233(boolean arg0) {
      try {
         if (arg0) {
            method233(false);
         }

         field352 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field354[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method234(int arg0, int arg1, int arg2) {
      try {
         ++field345;
         return arg2 != 2;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field354[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "a",
      descriptor = "(IZ)Lkba;"
   )
   public final class114 method235(int arg0, boolean arg1) {
      try {
         ++field346;
         if (this.field347 != null && ~arg0 <= -1 && ~arg0 > ~this.field347.length) {
            if (arg1) {
               this.method235(-52, true);
            }

            return this.field347[arg0];
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field354[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ir",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method236(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ir",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method237(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
