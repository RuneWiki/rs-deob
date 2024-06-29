import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class596 extends class446 {
   @OriginalMember(
      owner = "client!sj",
      name = "x",
      descriptor = "I"
   )
   private int field8760 = -1;
   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8764 = new String[]{method4433(method4432("<3Bd\u001a")), method4433(method4432("!,\u0000I")), method4433(method4432("4wB\u000bO")), method4433(method4432("<3Bg\u001a")), method4433(method4432("<3Bf\u001a"))};
   @OriginalMember(
      owner = "client!sj",
      name = "r",
      descriptor = "B"
   )
   private byte field8758;
   @OriginalMember(
      owner = "client!sj",
      name = "w",
      descriptor = "F"
   )
   public static float field8759;
   @OriginalMember(
      owner = "client!sj",
      name = "v",
      descriptor = "I"
   )
   public static int field8756;
   @OriginalMember(
      owner = "client!sj",
      name = "t",
      descriptor = "I"
   )
   public static int field8757;
   @OriginalMember(
      owner = "client!sj",
      name = "s",
      descriptor = "I"
   )
   public static int field8761;
   @OriginalMember(
      owner = "client!sj",
      name = "y",
      descriptor = "I"
   )
   private int field8763;
   @OriginalMember(
      owner = "client!sj",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private String field8762;

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(Lica;I)V"
   )
   public final void method805(class354 arg0, int arg1) {
      try {
         this.field8760 = arg0.method2848(arg1 ^ -127);
         if (arg1 != 0) {
            field8759 = 0.0035953345F;
         }

         ++field8761;
         this.field8758 = arg0.method2886((byte)88);
         this.field8763 = arg0.method2848(-123);
         arg0.method2898(32109);
         this.field8762 = arg0.method2843(-1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8764[0] + (arg0 != null ? field8764[2] : field8764[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(ILaka;)V"
   )
   public final void method810(int arg0, class637 arg1) {
      try {
         ++field8756;
         class277 var3 = arg1.field9240[this.field8760];
         var3.field4417 = this.field8762;
         if (arg0 != 32061) {
            this.method805((class354)null, -82);
         }

         var3.field4413 = this.field8763;
         var3.field4412 = this.field8758;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8764[4] + arg0 + ',' + (arg1 != null ? field8764[2] : field8764[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4431(int arg0, int arg1) {
      try {
         class502.field7674 = arg0;
         ++field8757;
         class304 var2 = class357.field5503;
         synchronized(class357.field5503) {
            class357.field5503.method2551(true);
         }

         if (arg1 == 2) {
            class304 var3 = class670.field9994;
            synchronized(class670.field9994) {
               class670.field9994.method2551(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8764[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4432(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4433(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
