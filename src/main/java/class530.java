import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class530 {
   @OriginalMember(
      owner = "client!eaa",
      name = "d",
      descriptor = "I"
   )
   private int field7272 = -1;
   @OriginalMember(
      owner = "client!eaa",
      name = "b",
      descriptor = "Lod;"
   )
   private class536 field7270 = new class536();
   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7274 = new String[]{method3831(method3830(".AuP\nc")), method3831(method3830("0\u000e:P5")), method3831(method3830("%Ux\u0012")), method3831(method3830(".AuP\fc")), method3831(method3830("kUd\u001a)?EZ\u000b%q")), method3831(method3830("kDq\u0012<*\u000e{\t&.R.")), method3831(method3830("\bLu\u0010\u001b.T`\u0017&,SP\u001b$?A:\u001f8;Lm*'\bLu\u0010\u001b.T`\u0017&,S<Wrkcf\u001b,.N`\u0017)'S4\u001a'kN{\nh&A`\u001d j\u0000G\u001b<?Iz\u0019;eOc\u0010-9\u001a")), method3831(method3830(".AuPt\"N}\nvc")), method3831(method3830(".AuP\u000bc")), method3831(method3830(".AuP\u000ec")), method3831(method3830(".AuP\rc")), method3831(method3830("\u001eNf\u001b+$Gz\u0017;.D4=$*NG\u001b<?Iz\u0019;\u000fEx\n)kTm\u000e-kIz^,.C{\u001a-c\t")), method3831(method3830("?\u001a"))};
   @OriginalMember(
      owner = "client!eaa",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field7265 = false;
   @OriginalMember(
      owner = "client!eaa",
      name = "g",
      descriptor = "I"
   )
   public static int field7266;
   @OriginalMember(
      owner = "client!eaa",
      name = "c",
      descriptor = "I"
   )
   public static int field7267;
   @OriginalMember(
      owner = "client!eaa",
      name = "e",
      descriptor = "I"
   )
   public static int field7269;
   @OriginalMember(
      owner = "client!eaa",
      name = "h",
      descriptor = "I"
   )
   public static int field7273;
   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "J"
   )
   private long field7268;
   @OriginalMember(
      owner = "client!eaa",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field7271;

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(Ljava/lang/String;B)V"
   )
   public static final void method3824(String arg0, byte arg1) {
      try {
         ++field7266;
         class127.method1069(0, arg0, "", (byte)80, "", "", 0);
         if (arg1 > -70) {
            field7271 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7274[0] + (arg0 != null ? field7274[1] : field7274[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3825(int arg0) {
      try {
         if (arg0 != 3) {
            field7265 = false;
         }

         field7271 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7274[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   private final void method3826(class594 param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3827(boolean arg0) {
      if (arg0) {
         class111.field1404 = class194.field2364;
         class93.field1241 = class73.field900;
      } else {
         class111.field1404 = class110.field1395;
         class93.field1241 = class144.field1906;
      }

      class398.field5594 = class111.field1404.length;
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3828(byte arg0) throws class265 {
      try {
         int var1 = 82 / ((-61 - arg0) / 42);
         ++field7273;
         if (~class616.field8588 == -2) {
            class633.field8958.method542(class347.field4984, class384.field5398);
         } else {
            class633.field8958.method542(0, 0);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7274[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method3829(boolean arg0, class139 arg1) {
      boolean var3 = client.field4273;

      try {
         ++field7267;
         if (~this.field7268 == ~arg1.field1843 && ~this.field7272 == ~arg1.field1845) {
            class690 var4 = (class690)this.field7270.method3855(127);
            if (var3) {
               var4.method27(arg0, arg1);
               var4 = (class690)this.field7270.method3866((byte)125);
            }

            while(true) {
               if (var4 == null) {
                  if (!var3) {
                     if (arg0) {
                        this.method3826((class594)null, (byte)-71);
                     }

                     ++arg1.field1845;
                     return;
                  }
               } else {
                  var4.method27(arg0, arg1);
               }

               var4 = (class690)this.field7270.method3866((byte)125);
            }
         } else {
            throw new RuntimeException(field7274[6] + class263.method2023(-126, arg1.field1843) + field7274[4] + arg1.field1845 + field7274[5] + class263.method2023(-121, this.field7268) + field7274[4] + this.field7272);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7274[3] + arg0 + ',' + (arg1 != null ? field7274[1] : field7274[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "<init>",
      descriptor = "(Lwm;)V"
   )
   public class530(class594 arg0) {
      try {
         this.method3826(arg0, (byte)-106);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7274[7] + (arg0 != null ? field7274[1] : field7274[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3830(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3831(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
