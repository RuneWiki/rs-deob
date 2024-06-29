import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class684 {
   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10182 = new String[]{method5057(method5056("ue<I^;")), method5057(method5056("ue<I\\;")), method5057(method5056("ue<IY;")), method5057(method5056("ue<I_;"))};
   @OriginalMember(
      owner = "client!faa",
      name = "f",
      descriptor = "I"
   )
   public static int field10177 = 0;
   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "I"
   )
   public static int field10179;
   @OriginalMember(
      owner = "client!faa",
      name = "d",
      descriptor = "I"
   )
   public static int field10180;
   @OriginalMember(
      owner = "client!faa",
      name = "c",
      descriptor = "I"
   )
   public static int field10181;
   @OriginalMember(
      owner = "client!faa",
      name = "e",
      descriptor = "Ljfa;"
   )
   public static class296 field10178;
   @OriginalMember(
      owner = "client!faa",
      name = "b",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field10176;

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(IIZ)V",
      line = 7
   )
   public static final void method5052(int arg0, int arg1, boolean arg2) {
      try {
         ++field10179;
         if (arg0 == 15381) {
            class503 var3 = class291.method2454(arg2, (byte)-26, arg1);
            if (var3 != null) {
               var3.method2477(1976);
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10182[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(I)V",
      line = 23
   )
   public static void method5053(int arg0) {
      try {
         if (arg0 != 0) {
            method5053(-87);
         }

         field10176 = null;
         field10178 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10182[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(B)V",
      line = 35
   )
   public static final void method5054(byte arg0) {
      try {
         if (arg0 > -64) {
            method5055(-111, -95, 67, -102, -38);
         }

         ++field10180;
         class153.field2290.method2551(true);
         class790.field11558.method2551(true);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10182[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "a",
      descriptor = "(IIIII)V",
      line = 51
   )
   public static final void method5055(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10181;
         if (arg3 != 10266) {
            field10178 = null;
         }

         int var5 = class528.field8017;
         if (~var5 != -1) {
            if (var5 == 1) {
               class45.field603 = arg1;
               class528.field8017 = 2;
               class604.field8829 = arg2;
               class627.field9082 = arg4;
               class559.field8323 = arg0;
               return;
            }

            if (var5 != 2) {
               return;
            }

            if (!client.field1786) {
               if (~class604.field8829 > ~arg2) {
                  class604.field8829 = arg2;
               }

               if (~class559.field8323 < ~arg0) {
                  class559.field8323 = arg0;
               }

               if (~arg4 < ~class627.field9082) {
                  class627.field9082 = arg4;
               }

               if (arg1 < class45.field603) {
                  class45.field603 = arg1;
               }

               return;
            }
         }

      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10182[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5056(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!faa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5057(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
