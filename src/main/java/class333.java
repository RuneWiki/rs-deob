import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class333 {
   @OriginalMember(
      owner = "client!aj",
      name = "h",
      descriptor = "[I"
   )
   private int[] field4771;
   @OriginalMember(
      owner = "client!aj",
      name = "i",
      descriptor = "[I"
   )
   private int[] field4773;
   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4783 = new String[]{method2654(method2653("^>}f\u0000")), method2654(method2653("^>}b\u0000")), method2654(method2653("^>}c\u0000")), method2654(method2653("^>}e\u0000")), method2654(method2653("^>}\u001bAQ='\u0019\u0000")), method2654(method2653("Dz}\tU")), method2654(method2653("Q!?K")), method2654(method2653("^>}d\u0000"))};
   @OriginalMember(
      owner = "client!aj",
      name = "l",
      descriptor = "Lgka;"
   )
   public static class394 field4774 = new class394("", 19);
   @OriginalMember(
      owner = "client!aj",
      name = "b",
      descriptor = "I"
   )
   private int field4772;
   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "I"
   )
   private int field4775;
   @OriginalMember(
      owner = "client!aj",
      name = "g",
      descriptor = "I"
   )
   public static int field4776;
   @OriginalMember(
      owner = "client!aj",
      name = "c",
      descriptor = "I"
   )
   private int field4777;
   @OriginalMember(
      owner = "client!aj",
      name = "j",
      descriptor = "I"
   )
   public static int field4778;
   @OriginalMember(
      owner = "client!aj",
      name = "e",
      descriptor = "I"
   )
   public static int field4779;
   @OriginalMember(
      owner = "client!aj",
      name = "f",
      descriptor = "I"
   )
   public static int field4780;
   @OriginalMember(
      owner = "client!aj",
      name = "d",
      descriptor = "I"
   )
   public static int field4781;
   @OriginalMember(
      owner = "client!aj",
      name = "k",
      descriptor = "I"
   )
   private int field4782;

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method2648(int arg0) {
      try {
         if (this.field4772 == 0) {
            this.method2649(38);
            this.field4772 = 256;
         }

         ++field4781;
         if (arg0 != 7) {
            field4780 = 29;
         }

         return this.field4771[this.field4772 + -1];
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4783[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method2649(int arg0) {
      boolean var2 = client.field4273;

      try {
         int var3 = -24 / ((arg0 - -67) / 37);
         ++field4779;
         this.field4775 += ++this.field4777;
         int var4 = 0;
         if (var2 || var4 < 256) {
            do {
               int var5;
               label49: {
                  var5 = this.field4773[var4];
                  if (~(2 & var4) != -1) {
                     if (~(1 & var4) == -1) {
                        this.field4782 <<= 2;
                        if (!var2) {
                           break label49;
                        }
                     }

                     this.field4782 >>>= 16;
                     if (!var2) {
                        break label49;
                     }
                  }

                  if (~(var4 & 1) == -1) {
                     this.field4782 <<= 13;
                     if (!var2) {
                        break label49;
                     }
                  }

                  this.field4782 >>>= 6;
               }

               this.field4782 += this.field4773[255 & var4 + 128];
               int var6;
               this.field4773[var4] = var6 = this.field4773[class743.method5375(var5 >> 2, 255)] + this.field4782 + this.field4775;
               this.field4771[var4] = this.field4775 = var5 + this.field4773[class743.method5375(var6 >> 8 >> 2, 255)];
               ++var4;
            } while(var4 < 256);

         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field4783[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method2650(byte arg0) {
      try {
         if (arg0 != 30) {
            this.method2649(40);
         }

         if (~this.field4772 == -1) {
            this.method2649(-124);
            this.field4772 = 256;
         }

         ++field4776;
         return this.field4771[--this.field4772];
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4783[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "<init>",
      descriptor = "()V"
   )
   private class333() {
   }

   @OriginalMember(
      owner = "client!aj",
      name = "<init>",
      descriptor = "([I)V"
   )
   public class333(int[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aj",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2651(byte arg0) {
      try {
         field4774 = null;
         if (arg0 > -95) {
            method2651((byte)86);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4783[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "b",
      descriptor = "(I)V"
   )
   private final void method2652(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2653(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2654(char[] arg0) {
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
            var10005 = 84;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
