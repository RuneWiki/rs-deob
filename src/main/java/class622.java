import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class622 {
   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9072 = new String[]{method4497(method4496("r\u0010J^B")), method4497(method4496("gK\b\u001c")), method4497(method4496("f[\u0005^{!")), method4497(method4496("f[\u0005^|!")), method4497(method4496("f[\u0005^}!")), method4497(method4496("f[\u0005^~!"))};
   @OriginalMember(
      owner = "client!oea",
      name = "g",
      descriptor = "Lpia;"
   )
   public static class102 field9060 = new class102("", 14);
   @OriginalMember(
      owner = "client!oea",
      name = "k",
      descriptor = "Lsd;"
   )
   public static class101 field9070 = new class101(94, 8);
   @OriginalMember(
      owner = "client!oea",
      name = "e",
      descriptor = "C"
   )
   public char field9061;
   @OriginalMember(
      owner = "client!oea",
      name = "d",
      descriptor = "F"
   )
   public static float field9069;
   @OriginalMember(
      owner = "client!oea",
      name = "j",
      descriptor = "I"
   )
   public int field9062;
   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "I"
   )
   public static int field9063;
   @OriginalMember(
      owner = "client!oea",
      name = "l",
      descriptor = "I"
   )
   public static int field9064;
   @OriginalMember(
      owner = "client!oea",
      name = "i",
      descriptor = "I"
   )
   public int field9065;
   @OriginalMember(
      owner = "client!oea",
      name = "f",
      descriptor = "I"
   )
   public static int field9066;
   @OriginalMember(
      owner = "client!oea",
      name = "h",
      descriptor = "I"
   )
   public static int field9067;
   @OriginalMember(
      owner = "client!oea",
      name = "c",
      descriptor = "I"
   )
   public int field9068;
   @OriginalMember(
      owner = "client!oea",
      name = "b",
      descriptor = "Lub;"
   )
   public static class22 field9071;

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(ZLjj;)V"
   )
   public final void method4492(boolean arg0, class128 arg1) {
      int var3 = client.field4530;

      try {
         if (!arg0) {
            ++field9067;

            do {
               int var4 = arg1.method1104(255);
               if (var4 == 0) {
                  break;
               }

               this.method4494(arg1, true, var4);
            } while(var3 == 0);

         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9072[2] + arg0 + ',' + (arg1 != null ? field9072[0] : field9072[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(IB)Lcj;"
   )
   public static final class721 method4493(int arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field9066;
         class721[] var3 = class79.method750((byte)102);
         int var4 = 0;
         if (arg1 != 65) {
            field9064 = 7;
            if (var2 != 0) {
               if (var3[var4].field10736 == arg0) {
                  return var3[var4];
               }

               ++var4;
            }
         }

         while(true) {
            while(var3.length > var4) {
               if (var3[var4].field10736 == arg0) {
                  return var3[var4];
               }

               ++var4;
            }

            if (var2 == 0) {
               return null;
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9072[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(Ljj;ZI)V"
   )
   private final void method4494(class128 arg0, boolean arg1, int arg2) {
      try {
         label30: {
            ++field9063;
            if (~arg2 == -2) {
               this.field9061 = class296.method2252(arg0.method1047((byte)23), 0);
               if (client.field4530 == 0) {
                  break label30;
               }
            }

            if (~arg2 == -3) {
               this.field9065 = arg0.method1038((byte)-117);
               this.field9062 = arg0.method1104(255);
               this.field9068 = arg0.method1104(255);
            }
         }

         if (!arg1) {
            method4493(35, (byte)-10);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field9072[4] + (arg0 != null ? field9072[0] : field9072[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4495(byte arg0) {
      try {
         field9060 = null;
         field9071 = null;
         field9070 = null;
         int var1 = -66 % ((arg0 - 48) / 57);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9072[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4496(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4497(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
