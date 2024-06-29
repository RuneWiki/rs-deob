import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class767 {
   @OriginalMember(
      owner = "client!au",
      name = "o",
      descriptor = "I"
   )
   public int field11122 = -1;
   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11137 = new String[]{method5551(method5550("@e\u001f\u0019R")), method5551(method5550("Z>\u001ft\u0007")), method5551(method5550("Oe]6")), method5551(method5550("@e\u001f\u0018R")), method5551(method5550("Ny")), method5551(method5550("@e\u001f\u001bR")), method5551(method5550("@e\u001f\u001eR"))};
   @OriginalMember(
      owner = "client!au",
      name = "n",
      descriptor = "I"
   )
   public static int field11135 = 0;
   @OriginalMember(
      owner = "client!au",
      name = "c",
      descriptor = "Luw;"
   )
   public static class435 field11126 = new class435(45, 4);
   @OriginalMember(
      owner = "client!au",
      name = "l",
      descriptor = "I"
   )
   public static int field11136 = 4;
   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "I"
   )
   public int field11123;
   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "I"
   )
   public int field11124;
   @OriginalMember(
      owner = "client!au",
      name = "f",
      descriptor = "I"
   )
   public int field11125;
   @OriginalMember(
      owner = "client!au",
      name = "m",
      descriptor = "I"
   )
   public int field11127;
   @OriginalMember(
      owner = "client!au",
      name = "e",
      descriptor = "I"
   )
   public static int field11128;
   @OriginalMember(
      owner = "client!au",
      name = "h",
      descriptor = "I"
   )
   public static int field11129;
   @OriginalMember(
      owner = "client!au",
      name = "g",
      descriptor = "I"
   )
   public int field11130;
   @OriginalMember(
      owner = "client!au",
      name = "d",
      descriptor = "I"
   )
   public int field11131;
   @OriginalMember(
      owner = "client!au",
      name = "j",
      descriptor = "I"
   )
   public int field11132;
   @OriginalMember(
      owner = "client!au",
      name = "i",
      descriptor = "I"
   )
   public static int field11133;
   @OriginalMember(
      owner = "client!au",
      name = "k",
      descriptor = "I"
   )
   public int field11134;

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(IIIIBII)V"
   )
   public static final void method5546(int param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!au",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5547(int arg0) {
      try {
         if (arg0 != 5301) {
            method5546(-50, 58, -78, 33, (byte)-71, 126, 77);
         }

         field11126 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11137[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(IILhw;I)Lika;"
   )
   public static final class445 method5548(int arg0, int arg1, class141 arg2, int arg3) {
      try {
         ++field11128;
         if (arg1 != -1253) {
            field11126 = null;
         }

         byte[] var4 = arg2.method1347((byte)126, arg3, arg0);
         return var4 == null ? null : new class445(var4);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11137[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11137[1] : field11137[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "a",
      descriptor = "(I)Lcc;"
   )
   public static final class760 method5549(int arg0) {
      try {
         ++field11129;
         if (arg0 != 256) {
            field11126 = null;
         }

         try {
            return (class760)Class.forName(field11137[4]).newInstance();
         } catch (Throwable var2) {
            return new class751();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11137[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5550(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!au",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5551(char[] arg0) {
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
            var10005 = 16;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
