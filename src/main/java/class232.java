import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class232 extends class476 implements class496 {
   @OriginalMember(
      owner = "client!bs",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3558 = new String[]{method1999(method1998("+7N\u0017_")), method1999(method1998("'1\f>")), method1999(method1998("+7N\u0010_")), method1999(method1998("2jN|\n")), method1999(method1998("+7N\u0016_")), method1999(method1998("+7N\u0014_")), method1999(method1998("+7Nn\u001e'-\u0014l_"))};
   @OriginalMember(
      owner = "client!bs",
      name = "C",
      descriptor = "Ldha;"
   )
   public static class642 field3552 = new class642("", 11);
   @OriginalMember(
      owner = "client!bs",
      name = "y",
      descriptor = "Luk;"
   )
   public static class498 field3554 = new class498(106, 16);
   @OriginalMember(
      owner = "client!bs",
      name = "B",
      descriptor = "Lnaa;"
   )
   public static class113 field3557 = new class113(36, -1);
   @OriginalMember(
      owner = "client!bs",
      name = "w",
      descriptor = "I"
   )
   public static int field3553;
   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "I"
   )
   public static int field3555;
   @OriginalMember(
      owner = "client!bs",
      name = "x",
      descriptor = "I"
   )
   public static int field3556;

   @OriginalMember(
      owner = "client!bs",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method1994(int arg0, int arg1) {
      try {
         ++field3555;
         class37.field448 = class510.field7801;
         class444.field6812 = arg1;
         class12.field156 = 2;
         String var2 = null;
         if (class625.field9068 != null) {
            class354 var3 = new class354(class625.field9068);
            var2 = class484.method3768((byte)8, var3.method2898(arg0 ^ 32078));
            class656.field9800 = var3.method2898(32109);
         }

         if (arg0 == 35) {
            if (var2 == null) {
               class56.method418(35, (byte)75);
            } else {
               class766.method5600(var2, true, (byte)44, "", false);
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3558[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method1995(int arg0, byte arg1, int arg2) {
      try {
         ++field3556;
         if (arg1 <= 58) {
            method1995(34, (byte)80, -64);
         }

         return class612.method4509(16544, arg0, arg2) & ((8192 & arg0) != 0 | class187.method1679(arg2, arg0, 127) | class681.method5041(-111, arg2, arg0));
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3558[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "<init>",
      descriptor = "(Lcka;IZ[[I)V"
   )
   public class232(class174 param1, int param2, boolean param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "([[II)V"
   )
   public static final void method1996(int[][] arg0, int arg1) {
      try {
         class512.field7820 = arg0;
         ++field3553;
         if (arg1 != 34067) {
            field3557 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3558[2] + (arg0 != null ? field3558[3] : field3558[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1997(boolean arg0) {
      try {
         field3554 = null;
         if (!arg0) {
            field3552 = null;
         }

         field3557 = null;
         field3552 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3558[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1998(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1999(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
