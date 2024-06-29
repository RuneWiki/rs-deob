import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class616 {
   @OriginalMember(
      owner = "client!nw",
      name = "f",
      descriptor = "I"
   )
   private int field8587;
   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "I"
   )
   public int field8590;
   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8594 = new String[]{method4475(method4474("f[3ei")), method4475(method4474("f[3gi")), method4475(method4474("f[3\u001a(fEi\u0018i")), method4475(method4474("f[3R.[XoO/o\u0004")), method4475(method4474("f[3di"))};
   @OriginalMember(
      owner = "client!nw",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8591 = "";
   @OriginalMember(
      owner = "client!nw",
      name = "g",
      descriptor = "I"
   )
   public static int field8586;
   @OriginalMember(
      owner = "client!nw",
      name = "e",
      descriptor = "I"
   )
   public static int field8588;
   @OriginalMember(
      owner = "client!nw",
      name = "b",
      descriptor = "I"
   )
   public static int field8592;
   @OriginalMember(
      owner = "client!nw",
      name = "c",
      descriptor = "I"
   )
   public static int field8593;
   @OriginalMember(
      owner = "client!nw",
      name = "h",
      descriptor = "Ljava/awt/Image;"
   )
   public static Image field8589;

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4471(boolean arg0) {
      try {
         field8589 = null;
         field8591 = null;
         if (!arg0) {
            method4472(1.2933345782855763D, 74);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8594[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field8593;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8594[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class616(int arg0, int arg1) {
      try {
         this.field8587 = arg0;
         this.field8590 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8594[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(DI)V"
   )
   public static final void method4472(double arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 < -92) {
            if (class309.field4101 != arg0) {
               int var4 = 0;
               int var5;
               if (var3) {
                  var5 = (int)(Math.pow((double)var4 / 255.0D, arg0) * 255.0D);
                  class196.field2375[var4] = var5 <= 255 ? var5 : 255;
                  ++var4;
               }

               while(true) {
                  double var10000;
                  if (~var4 <= -257) {
                     var10000 = arg0;
                     if (!var3) {
                        class309.field4101 = arg0;
                        break;
                     }
                  } else {
                     var10000 = Math.pow((double)var4 / 255.0D, arg0) * 255.0D;
                  }

                  var5 = (int)var10000;
                  class196.field2375[var4] = var5 <= 255 ? var5 : 255;
                  ++var4;
               }
            }

            ++field8592;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field8594[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method4473(int arg0) {
      try {
         ++field8586;
         return arg0 != 255 ? -29 : this.field8587;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8594[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4474(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4475(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
