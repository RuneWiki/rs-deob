import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {
   @OriginalMember(
      owner = "client!dp",
      name = "k",
      descriptor = "Z"
   )
   public boolean field70;
   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field74 = new String[]{method36(method35("E\\BE6")), method36(method35("E\\BG6")), method36(method35("E\\B8wOE\u0018:6")), method36(method35("E\\BB6")), method36(method35("E\\BA6")), method36(method35("E\\BF6")), method36(method35("E\\B@6"))};
   @OriginalMember(
      owner = "client!dp",
      name = "e",
      descriptor = "I"
   )
   public static int field63 = 0;
   @OriginalMember(
      owner = "client!dp",
      name = "j",
      descriptor = "I"
   )
   public static int field66;
   @OriginalMember(
      owner = "client!dp",
      name = "c",
      descriptor = "I"
   )
   public static int field68;
   @OriginalMember(
      owner = "client!dp",
      name = "h",
      descriptor = "I"
   )
   public static int field69;
   @OriginalMember(
      owner = "client!dp",
      name = "f",
      descriptor = "I"
   )
   public static int field72;
   @OriginalMember(
      owner = "client!dp",
      name = "i",
      descriptor = "I"
   )
   public static int field73;
   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "Lhi;"
   )
   public class215 field64;
   @OriginalMember(
      owner = "client!dp",
      name = "g",
      descriptor = "Lhi;"
   )
   public class215 field67;
   @OriginalMember(
      owner = "client!dp",
      name = "d",
      descriptor = "Z"
   )
   public boolean field71;
   @OriginalMember(
      owner = "client!dp",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field65;

   @OriginalMember(
      owner = "client!dp",
      name = "b",
      descriptor = "(I)Z",
      line = 4
   )
   public final boolean method29(int arg0) {
      try {
         ++field68;
         if (arg0 != 544) {
            field65 = null;
         }

         return this.field71 && !this.field70;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field74[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(ZIII)V",
      line = 15
   )
   public static final void method30(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         ++field66;
         if (arg0) {
            method30(false, 64, 59, -70);
         }

         class403 var4 = class453.method3410((long)arg2, true, 9);
         var4.method3093(22144);
         var4.field6185 = arg3;
         var4.field6183 = arg1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field74[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(ZII)Z",
      line = 35
   )
   public static final boolean method31(boolean arg0, int arg1, int arg2) {
      try {
         ++field73;
         if (!arg0) {
            method31(true, 85, -3);
         }

         return (384 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field74[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(IBI)Z",
      line = 47
   )
   public static final boolean method32(int arg0, byte arg1, int arg2) {
      try {
         ++field72;
         int var3 = -99 % ((arg1 - -8) / 37);
         return (24 & arg2) != 0 | ~(arg2 & 544) == -545;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field74[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "<init>",
      descriptor = "(Z)V",
      line = 60
   )
   public class3(boolean arg0) {
      try {
         this.field70 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field74[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(Z)V",
      line = 72
   )
   public final void method33(boolean arg0) {
      try {
         ++field69;
         if (this.field67 != null) {
            this.field67.method423(-15607);
         }

         this.field71 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field74[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(I)V",
      line = 83
   )
   public static void method34(int arg0) {
      try {
         field65 = null;
         if (arg0 < 99) {
            field63 = 68;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field74[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method35(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method36(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
