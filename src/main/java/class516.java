import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public abstract class class516 {
   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7516 = new String[]{method3905(method3904("u#Ig\u007f")), method3905(method3904("u#Iy\u007f")), method3905(method3904("u#Iz\u007f")), method3905(method3904("u#I{\u007f"))};
   @OriginalMember(
      owner = "client!ew",
      name = "d",
      descriptor = "Luw;"
   )
   public static class435 field7512 = new class435(35, 7);
   @OriginalMember(
      owner = "client!ew",
      name = "c",
      descriptor = "I"
   )
   public static int field7508;
   @OriginalMember(
      owner = "client!ew",
      name = "g",
      descriptor = "I"
   )
   public static int field7509;
   @OriginalMember(
      owner = "client!ew",
      name = "e",
      descriptor = "I"
   )
   public static int field7510;
   @OriginalMember(
      owner = "client!ew",
      name = "f",
      descriptor = "I"
   )
   public static int field7511;
   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "J"
   )
   public static long field7513;
   @OriginalMember(
      owner = "client!ew",
      name = "h",
      descriptor = "Ljfa;"
   )
   public static class303 field7515;
   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "Lww;"
   )
   public static class761 field7514;

   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method758(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "(BI)[B"
   )
   public abstract byte[] method768(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(BI)I"
   )
   public abstract int method757(byte arg0, int arg1);

   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3899(int arg0) {
      try {
         ++field7508;
         if (class636.field9268 != null) {
            if (arg0 != 7) {
               method3903(true);
            }

            class636.field9268 = null;
            class692.method5033(class470.field6832, true, class640.field9329, class401.field5898, class82.field1380);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7516[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method3900(int arg0, int arg1) {
      try {
         ++field7510;
         if (class28.method199(arg1 + 1, arg0)) {
            class696.method5059((byte)-97, arg1, class253.field3608[arg0]);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7516[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3901(byte arg0) {
      try {
         if (arg0 != -99) {
            method3903(false);
         }

         field7515 = null;
         field7512 = null;
         field7514 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7516[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"
   )
   public static final String method3902(int arg0, String arg1, String arg2, String arg3) {
      boolean var4 = client.field4564;
      ++field7511;
      if (arg0 >= -62) {
         method3903(false);
      }

      int var5 = arg2.indexOf(arg1);
      if (var4) {
         arg2 = arg2.substring(0, var5) + arg3 + arg2.substring(arg1.length() + var5);
         var5 = arg2.indexOf(arg1, arg3.length() + var5);
      }

      while(true) {
         while(var5 != -1) {
            arg2 = arg2.substring(0, var5) + arg3 + arg2.substring(arg1.length() + var5);
            var5 = arg2.indexOf(arg1, arg3.length() + var5);
         }

         if (!var4) {
            return arg2;
         }

         var5 = arg2.indexOf(arg1, arg3.length() + var5);
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3903(boolean arg0) {
      try {
         ++field7509;
         class529.method3961(2, -48001, 22050, class510.field7454.field11177.method4391(arg0) == 1);
         class600.field8650 = class101.method966(class412.field6033, -122, 0, class386.field5692, 22050);
         class326.method2530(true, class632.method4642((class582)null, -100), (byte)66);
         class39.field934 = class101.method966(class412.field6033, -104, 1, class386.field5692, 2048);
         class749.field10795 = new class181();
         class39.field934.method1560(32, class749.field10795);
         class57.field1126 = new class51(22050, class755.field10967);
         class182.method1610(86);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7516[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(I)Lsn;"
   )
   public abstract class655 method759(int arg0);

   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3904(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3905(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
