import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class313 {
   @OriginalMember(
      owner = "client!nba",
      name = "h",
      descriptor = "I"
   )
   public int field4509;
   @OriginalMember(
      owner = "client!nba",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public String field4501;
   @OriginalMember(
      owner = "client!nba",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field4502;
   @OriginalMember(
      owner = "client!nba",
      name = "j",
      descriptor = "I"
   )
   public int field4504;
   @OriginalMember(
      owner = "client!nba",
      name = "k",
      descriptor = "Ljava/lang/String;"
   )
   public String field4500;
   @OriginalMember(
      owner = "client!nba",
      name = "c",
      descriptor = "I"
   )
   public int field4498;
   @OriginalMember(
      owner = "client!nba",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   public String field4506;
   @OriginalMember(
      owner = "client!nba",
      name = "m",
      descriptor = "I"
   )
   public int field4507;
   @OriginalMember(
      owner = "client!nba",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field4499;
   @OriginalMember(
      owner = "client!nba",
      name = "i",
      descriptor = "I"
   )
   public int field4505;
   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4511 = new String[]{method2433(method2432("hi?qK.")), method2433(method2432("hi?q5oe7+7.")), method2433(method2432("h~23")), method2433(method2432("}%pqt")), method2433(method2432("hi?qH.")), method2433(method2432("hi?qJ."))};
   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "Lqg;"
   )
   public static class485 field4510 = new class485(8, 1);
   @OriginalMember(
      owner = "client!nba",
      name = "e",
      descriptor = "I"
   )
   public static int field4497;
   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "I"
   )
   public static int field4503;
   @OriginalMember(
      owner = "client!nba",
      name = "g",
      descriptor = "I"
   )
   public static int field4508;

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(B)V",
      line = 10
   )
   public static final void method2429(byte arg0) {
      try {
         class179 var1 = class734.field10556;
         synchronized(class734.field10556) {
            class734.field10556.method1589((byte)114);
         }

         ++field4503;
         class179 var2 = class641.field9350;
         synchronized(class641.field9350) {
            if (arg0 != 102) {
               method2429((byte)-116);
            }

            class641.field9350.method1589((byte)108);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4511[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V",
      line = 26
   )
   public final void method2430(String arg0, String arg1, int arg2, boolean arg3, String arg4, int arg5, String arg6, int arg7, String arg8) {
      try {
         ++field4508;
         this.field4509 = class265.method2117(30);
         this.field4507 = class29.field458;
         this.field4502 = arg6;
         this.field4506 = arg0;
         if (!arg3) {
            method2431(36);
         }

         this.field4504 = arg2;
         this.field4501 = arg8;
         this.field4505 = arg5;
         this.field4499 = arg1;
         this.field4500 = arg4;
         this.field4498 = arg7;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field4511[5] + (arg0 != null ? field4511[3] : field4511[2]) + ',' + (arg1 != null ? field4511[3] : field4511[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4511[3] : field4511[2]) + ',' + arg5 + ',' + (arg6 != null ? field4511[3] : field4511[2]) + ',' + arg7 + ',' + (arg8 != null ? field4511[3] : field4511[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "<init>",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V",
      line = 52
   )
   public class313(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
      try {
         this.field4509 = class265.method2117(30);
         this.field4501 = arg2;
         this.field4502 = arg5;
         this.field4504 = arg1;
         this.field4500 = arg3;
         this.field4498 = arg6;
         this.field4506 = arg7;
         this.field4507 = class29.field458;
         this.field4499 = arg4;
         this.field4505 = arg0;
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field4511[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4511[3] : field4511[2]) + ',' + (arg3 != null ? field4511[3] : field4511[2]) + ',' + (arg4 != null ? field4511[3] : field4511[2]) + ',' + (arg5 != null ? field4511[3] : field4511[2]) + ',' + arg6 + ',' + (arg7 != null ? field4511[3] : field4511[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(I)V",
      line = 70
   )
   public static void method2431(int arg0) {
      try {
         if (arg0 != 1) {
            method2431(127);
         }

         field4510 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4511[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2432(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2433(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
