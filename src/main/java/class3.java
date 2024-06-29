import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 extends class11 {
   @OriginalMember(
      owner = "client!dp",
      name = "i",
      descriptor = "I"
   )
   public int field17;
   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field18 = new String[]{method22(method21("\u001cB<bB")), method22(method21("\u001cB<`B")), method22(method21("\u001cB<\u001d\u0003\u0016[f\u001fB")), method22(method21("\u0016G~M")), method22(method21("\u0003\u001c<\u000f\u0017")), method22(method21("\u001cB<cB"))};
   @OriginalMember(
      owner = "client!dp",
      name = "j",
      descriptor = "I"
   )
   public static int field13;
   @OriginalMember(
      owner = "client!dp",
      name = "h",
      descriptor = "I"
   )
   public static int field14;
   @OriginalMember(
      owner = "client!dp",
      name = "k",
      descriptor = "I"
   )
   public static int field15;
   @OriginalMember(
      owner = "client!dp",
      name = "l",
      descriptor = "I"
   )
   public static int field16;

   @OriginalMember(
      owner = "client!dp",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method18(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field13;
         int var2 = 0;
         if (var1) {
            class205.field2521[var2] = false;
            ++var2;
         }

         while(true) {
            while(~var2 > -6) {
               class205.field2521[var2] = false;
               ++var2;
            }

            if (!var1) {
               if (arg0 != 3810) {
                  method18(30);
               }

               class762.field11018 = -1;
               class118.field1443 = class737.field10747;
               class708.field10287 = 0;
               class488.field6732 = class532.field7284;
               class183.field2259 = -1;
               class148.field1936 = class369.field5205;
               class706.field10251 = 0;
               class221.field2762 = class331.field4733;
               class635.field8977 = 5;
               class22.field290 = class171.field2144;
               class552.field7597 = -1;
               class721.field10567 = -1;
               class118.field1440 = class749.field10899;
               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field18[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "<init>",
      descriptor = "(ILsq;Ljh;III)V"
   )
   public class3(int arg0, class190 arg1, class169 arg2, int arg3, int arg4, int arg5) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field17 = arg5;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field18[2] + arg0 + ',' + (arg1 != null ? field18[4] : field18[3]) + ',' + (arg2 != null ? field18[4] : field18[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public final class365 method19(int arg0) {
      try {
         int var2 = -128 / ((1 - arg0) / 55);
         ++field14;
         return class671.field9869;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field18[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "a",
      descriptor = "(IIIIBILha;Ljava/lang/String;)V"
   )
   public static final void method20(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class65 arg6, String arg7) {
      boolean var8 = client.field4273;

      try {
         ++field15;
         if (class345.field4945 == null || class416.field5849 == null) {
            label96: {
               if (!class354.field5051.method717(class283.field3775, (byte)-58) || !class354.field5051.method717(class395.field5569, (byte)-58)) {
                  arg6.method508(arg1, arg2, arg5, arg0, class595.field8295 | 255 - class462.field6337 << 24, 1);
                  if (!var8) {
                     break label96;
                  }
               }

               class345.field4945 = arg6.method549(class267.method2050(class354.field5051, class283.field3775, 0), true);
               class267 var9 = class267.method2050(class354.field5051, class395.field5569, 0);
               class416.field5849 = arg6.method549(var9, true);
               var9.method2045();
               class790.field11554 = arg6.method549(var9, true);
            }
         }

         if (class345.field4945 != null && class416.field5849 != null) {
            int var10 = (arg5 + -(2 * class416.field5849.method2126())) / class345.field4945.method2126();
            int var11 = 0;
            if (var8) {
               class345.field4945.method5482(class416.field5849.method2126() + (arg1 - -(class345.field4945.method2126() * var11)), arg2);
               ++var11;
            }

            while(true) {
               while(var10 > var11) {
                  class345.field4945.method5482(class416.field5849.method2126() + (arg1 - -(class345.field4945.method2126() * var11)), arg2);
                  ++var11;
               }

               class416.field5849.method5482(arg1, arg2);
               class763 var10000 = class790.field11554;
               int var10001 = arg5 + arg1 + -class790.field11554.method2126();
               if (!var8) {
                  var10000.method5482(var10001, arg2);
                  break;
               }

               var10000.method5482(var10001, arg2);
               ++var11;
            }
         }

         class101.field1310.method630(-16777216 | class439.field6094, arg2 - -14, arg7, -1, arg1 - -3, 16656);
         arg6.method508(arg1, arg0 + arg2, arg5, arg3 - arg0, -class462.field6337 + 255 << 24 | class595.field8295, 1);
         if (arg4 != -51) {
            field16 = 39;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field18[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field18[4] : field18[3]) + ',' + (arg7 != null ? field18[4] : field18[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method21(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method22(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
