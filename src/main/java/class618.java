import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class618 extends class335 {
   @OriginalMember(
      owner = "client!kq",
      name = "m",
      descriptor = "I"
   )
   private int field9014;
   @OriginalMember(
      owner = "client!kq",
      name = "l",
      descriptor = "I"
   )
   private int field9021;
   @OriginalMember(
      owner = "client!kq",
      name = "k",
      descriptor = "I"
   )
   private int field9020;
   @OriginalMember(
      owner = "client!kq",
      name = "p",
      descriptor = "I"
   )
   private int field9015;
   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9026 = new String[]{method4476(method4475("\u0000`u@^")), method4476(method4475("\u0000`u>\u001f\u0005x/<^")), method4476(method4475("\u0000`uF^")), method4476(method4475("\u0000`uA^")), method4476(method4475("\u0000`uC^"))};
   @OriginalMember(
      owner = "client!kq",
      name = "s",
      descriptor = "Z"
   )
   public static volatile boolean field9022 = false;
   @OriginalMember(
      owner = "client!kq",
      name = "t",
      descriptor = "Lsda;"
   )
   public static class269 field9017 = new class269(75, 7);
   @OriginalMember(
      owner = "client!kq",
      name = "i",
      descriptor = "Lum;"
   )
   public static class550 field9025 = new class550();
   @OriginalMember(
      owner = "client!kq",
      name = "n",
      descriptor = "I"
   )
   public static int field9016;
   @OriginalMember(
      owner = "client!kq",
      name = "q",
      descriptor = "I"
   )
   public static int field9018;
   @OriginalMember(
      owner = "client!kq",
      name = "j",
      descriptor = "I"
   )
   public static int field9019;
   @OriginalMember(
      owner = "client!kq",
      name = "o",
      descriptor = "I"
   )
   public static int field9023;
   @OriginalMember(
      owner = "client!kq",
      name = "r",
      descriptor = "Z"
   )
   public static boolean field9024;

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method4474(byte arg0) {
      try {
         if (arg0 < 87) {
            method4474((byte)2);
         }

         field9017 = null;
         field9025 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9026[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(IBI)V",
      line = 14
   )
   public final void method2537(int arg0, byte arg1, int arg2) {
      try {
         ++field9018;
         int var4 = this.field9014 * arg2 >> 12;
         int var5 = this.field9021 * arg2 >> 12;
         int var6 = this.field9015 * arg0 >> 12;
         if (arg1 > 84) {
            int var7 = this.field9020 * arg0 >> 12;
            class599.method4381(-124, var7, var5, var6, var4, super.field4793);
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field9026[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "<init>",
      descriptor = "(IIIIIII)V",
      line = 33
   )
   public class618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field9014 = arg0;
         this.field9021 = arg2;
         this.field9020 = arg3;
         this.field9015 = arg1;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field9026[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(III)V",
      line = 50
   )
   public final void method2541(int arg0, int arg1, int arg2) {
      try {
         ++field9019;
         int var4 = this.field9014 * arg0 >> 12;
         if (arg1 != 0) {
            field9024 = true;
         }

         int var5 = this.field9021 * arg0 >> 12;
         int var6 = this.field9015 * arg2 >> 12;
         int var7 = this.field9020 * arg2 >> 12;
         class479.method3557(var5, -30468, super.field4789, var7, super.field4793, super.field4791, var6, var4);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field9026[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "a",
      descriptor = "(BII)V",
      line = 70
   )
   public final void method2540(byte arg0, int arg1, int arg2) {
      try {
         ++field9016;
         if (arg0 <= 71) {
            this.field9021 = 0;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9026[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4475(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4476(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
