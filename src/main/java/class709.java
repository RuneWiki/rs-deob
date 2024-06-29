import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class709 {
   @OriginalMember(
      owner = "client!ar",
      name = "c",
      descriptor = "Lgw;"
   )
   private class179 field10303 = new class179(16);
   @OriginalMember(
      owner = "client!ar",
      name = "b",
      descriptor = "Lhw;"
   )
   private class141 field10308;
   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10310 = new String[]{method5158(method5157("WlJIM")), method5158(method5157("WlJJM")), method5158(method5157("WlJHM")), method5158(method5157("WlJOM")), method5158(method5157("M0J%\u0018")), method5158(method5157("Xk\bg")), method5158(method5157("WlJ7\fXw\u00105M"))};
   @OriginalMember(
      owner = "client!ar",
      name = "f",
      descriptor = "I"
   )
   public static int field10304;
   @OriginalMember(
      owner = "client!ar",
      name = "e",
      descriptor = "I"
   )
   public static int field10305;
   @OriginalMember(
      owner = "client!ar",
      name = "g",
      descriptor = "I"
   )
   public static int field10306;
   @OriginalMember(
      owner = "client!ar",
      name = "d",
      descriptor = "I"
   )
   public static int field10307;
   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "I"
   )
   public static int field10309;

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(BI)Lnda;",
      line = 5
   )
   public final class581 method5153(byte arg0, int arg1) {
      try {
         if (arg0 != -125) {
            return null;
         } else {
            ++field10305;
            class179 var3 = this.field10303;
            class581 var4;
            synchronized(this.field10303) {
               var4 = (class581)this.field10303.method1584((long)arg1, 1);
            }

            if (var4 != null) {
               return var4;
            } else {
               class141 var5 = this.field10308;
               byte[] var6;
               synchronized(this.field10308) {
                  var6 = this.field10308.method1347((byte)127, 30, arg1);
               }

               class581 var7 = new class581();
               if (var6 != null) {
                  var7.method4283(-127, new class473(var6));
               }

               class179 var8 = this.field10303;
               synchronized(this.field10303) {
                  this.field10303.method1581((long)arg1, arg0 + 125, var7);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field10310[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(I)V",
      line = 40
   )
   public final void method5154(int arg0) {
      try {
         if (arg0 <= 26) {
            this.method5153((byte)-118, 120);
         }

         ++field10307;
         class179 var2 = this.field10303;
         synchronized(this.field10303) {
            this.field10303.method1591((byte)58);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10310[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "b",
      descriptor = "(BI)V",
      line = 56
   )
   public final void method5155(byte arg0, int arg1) {
      try {
         class179 var3 = this.field10303;
         synchronized(this.field10303) {
            this.field10303.method1579(103, arg1);
         }

         ++field10309;
         if (arg0 != -55) {
            this.method5155((byte)68, -23);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10310[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "a",
      descriptor = "(Z)V",
      line = 70
   )
   public final void method5156(boolean arg0) {
      try {
         ++field10306;
         class179 var2 = this.field10303;
         synchronized(this.field10303) {
            this.field10303.method1589((byte)56);
            if (arg0) {
               this.method5156(true);
            }

         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10310[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V",
      line = 89
   )
   public class709(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field10308 = arg2;
         this.field10308.method1346(30, 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10310[6] + (arg0 != null ? field10310[4] : field10310[5]) + ',' + arg1 + ',' + (arg2 != null ? field10310[4] : field10310[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5157(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ar",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5158(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
