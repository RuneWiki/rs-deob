import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class468 {
   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6825 = new String[]{method3508(method3507("\u007fO\b\u000fs")), method3508(method3507("\u007fMEb")), method3508(method3507("nPB{o")), method3508(method3507("bNL,-n\u0012")), method3508(method3507("b\\E")), method3508(method3507("w\u0005\u0010")), method3508(method3507("w\u0005\u0010b")), method3508(method3507("xTH)4xN\t")), method3508(method3507("f\u000e\u001e{")), method3508(method3507("w\u0005\u0010\u0012m;\u0012")), method3508(method3507("w\u0005\u0010\u0012m;")), method3508(method3507("\u007fO\b\u000es")), method3508(method3507("zSO;>}NG!t")), method3508(method3507("xTH")), method3508(method3507("cTH8#")), method3508(method3507("aHJ!")), method3508(method3507("cTH8# ")), method3508(method3507("f\b\u001e{")), method3508(method3507("\u007fME")), method3508(method3507("b\\E\"( ")), method3508(method3507("f\t\u001e{")), method3508(method3507("t\u0013\bc&")), method3508(method3507("\u007fO\b\fs"))};
   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field6823 = false;
   @OriginalMember(
      owner = "client!pr",
      name = "d",
      descriptor = "I"
   )
   public static int field6821 = 0;
   @OriginalMember(
      owner = "client!pr",
      name = "b",
      descriptor = "Luw;"
   )
   public static class435 field6820 = new class435(24, 8);
   @OriginalMember(
      owner = "client!pr",
      name = "c",
      descriptor = "I"
   )
   public static int field6822;
   @OriginalMember(
      owner = "client!pr",
      name = "e",
      descriptor = "I"
   )
   public static int field6824;

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3504(boolean arg0) {
      try {
         label20: {
            if (~class463.field6773 >= -2) {
               class510.field7454.method5552(2, -115, class510.field7454.field11180);
               if (!client.field4564) {
                  break label20;
               }
            }

            class510.field7454.method5552(4, 119, class510.field7454.field11180);
         }

         if (arg0) {
            method3504(false);
         }

         ++field6822;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6825[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3505(int arg0) {
      try {
         field6820 = null;
         int var1 = 0 / ((arg0 - -30) / 52);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6825[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "a",
      descriptor = "(ILhw;Loo;)V"
   )
   public static final void method3506(int arg0, class141 arg1, class651 arg2) {
      boolean var3 = client.field4564;

      try {
         class342.field4858 = arg2;
         class649.field9415 = "";
         if (arg0 == 2) {
            label72: {
               class599.field8637 = arg1;
               ++field6824;
               if (!class614.field8919.startsWith(field6825[13])) {
                  if (!class614.field8919.startsWith(field6825[14])) {
                     if (!class614.field8919.startsWith(field6825[4])) {
                        break label72;
                     }

                     class649.field9415 = class649.field9415 + field6825[19];
                     if (!var3) {
                        break label72;
                     }
                  }

                  class649.field9415 = class649.field9415 + field6825[16];
                  if (!var3) {
                     break label72;
                  }
               }

               class649.field9415 = class649.field9415 + field6825[7];
            }

            if (class342.field4858.field9441) {
               class649.field9415 = class649.field9415 + field6825[3];
            } else if (!class614.field8918.startsWith(field6825[2]) && !class614.field8918.startsWith(field6825[10])) {
               if (!class614.field8918.startsWith(field6825[8]) && !class614.field8918.startsWith(field6825[20]) && !class614.field8918.startsWith(field6825[17]) && !class614.field8918.startsWith(field6825[5])) {
                  if (class614.field8918.startsWith(field6825[18])) {
                     class649.field9415 = class649.field9415 + field6825[1];
                  } else {
                     class649.field9415 = class649.field9415 + field6825[12];
                  }
               } else {
                  class649.field9415 = class649.field9415 + field6825[6];
               }
            } else {
               class649.field9415 = class649.field9415 + field6825[9];
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6825[11] + arg0 + ',' + (arg1 != null ? field6825[21] : field6825[15]) + ',' + (arg2 != null ? field6825[21] : field6825[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3507(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3508(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
