import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class615 {
   @OriginalMember(
      owner = "client!eba",
      name = "b",
      descriptor = "Loi;"
   )
   private class80 field9035 = new class80(256);
   @OriginalMember(
      owner = "client!eba",
      name = "g",
      descriptor = "Ld;"
   )
   private class162 field9034;
   @OriginalMember(
      owner = "client!eba",
      name = "h",
      descriptor = "Lsc;"
   )
   private class369 field9031;
   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9040 = new String[]{method4473(method4472("\u000e\u001b/adC")), method4473(method4472("\u000e\u001b/aeC")), method4473(method4472("\u000e\u001b/acC")), method4473(method4472("\u000e\u001b/afC")), method4473(method4472("\u0005\f\"#")), method4473(method4472("\u0010W`aZ")), method4473(method4472("\u000e\u001b/a\u001b\u0002\u0017';\u0019C"))};
   @OriginalMember(
      owner = "client!eba",
      name = "c",
      descriptor = "Leg;"
   )
   public static class118 field9036 = new class118(119, -1);
   @OriginalMember(
      owner = "client!eba",
      name = "f",
      descriptor = "[[B"
   )
   public static byte[][] field9039 = new byte[1000][];
   @OriginalMember(
      owner = "client!eba",
      name = "d",
      descriptor = "I"
   )
   public static int field9033;
   @OriginalMember(
      owner = "client!eba",
      name = "i",
      descriptor = "I"
   )
   public static int field9037;
   @OriginalMember(
      owner = "client!eba",
      name = "e",
      descriptor = "I"
   )
   public static int field9038;
   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "[Lwl;"
   )
   public static class433[] field9032;

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method4468(int arg0) {
      try {
         field9032 = null;
         field9036 = null;
         if (arg0 != 5) {
            field9032 = null;
         }

         field9039 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9040[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(B)V",
      line = 21
   )
   public final void method4469(byte arg0) {
      try {
         ++field9038;
         this.field9035.method726(5, 25324);
         int var2 = 89 / ((53 - arg0) / 42);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9040[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(Z)V",
      line = 31
   )
   public final void method4470(boolean arg0) {
      try {
         this.field9035.method731(0);
         if (arg0) {
            method4468(18);
         }

         ++field9037;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9040[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(II)Lfc;",
      line = 45
   )
   public final class272 method4471(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field9033;
         Object var4 = this.field9035.method725(0, (long)arg0);
         if (var4 != null) {
            return (class272)var4;
         } else if (!this.field9034.method1353(arg0, (byte)125)) {
            return null;
         } else {
            class317 var5 = this.field9034.method1354(arg0, (byte)-109);
            if (arg1 != 4065) {
               return null;
            } else {
               class272 var8;
               label62: {
                  int var6 = var5.field4318 ? 64 : this.field9031.field5305;
                  if (var5.field4312 && this.field9031.method528()) {
                     float[] var7 = this.field9034.method1355(var6, 0.7F, var6, arg0, (byte)110, false);
                     var8 = this.field9031.method2798(var7, var5.field4322 != 0, var6, arg1 + -4065, var6, class424.field6036);
                     if (!var3) {
                        break label62;
                     }
                  }

                  int[] var9;
                  label44: {
                     if (var5.field4319 != 2 && class369.method2754(-8, var5.field4308)) {
                        var9 = this.field9034.method1350(0.7F, arg0, var6, var6, (byte)108, true);
                        if (!var3) {
                           break label44;
                        }
                     }

                     var9 = this.field9034.method1351(var6, 0.7F, false, arg0, 12356, var6);
                  }

                  var8 = this.field9031.method2759(~var5.field4322 != -1, var6, 0, var9, var6);
               }

               var8.method277(true, var5.field4313, var5.field4309);
               this.field9035.method723(0, (long)arg0, var8);
               return var8;
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field9040[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "<init>",
      descriptor = "(Lsc;Ld;)V",
      line = 95
   )
   public class615(class369 arg0, class162 arg1) {
      try {
         this.field9034 = arg1;
         this.field9031 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9040[6] + (arg0 != null ? field9040[5] : field9040[4]) + ',' + (arg1 != null ? field9040[5] : field9040[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4472(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4473(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
