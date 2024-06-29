import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class761 {
   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "Lgw;"
   )
   private class179 field11039 = new class179(64);
   @OriginalMember(
      owner = "client!ww",
      name = "d",
      descriptor = "Lhw;"
   )
   private class141 field11032;
   @OriginalMember(
      owner = "client!ww",
      name = "b",
      descriptor = "I"
   )
   public int field11036;
   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11041 = new String[]{method5505(method5504("P7;u\u0012")), method5505(method5504("P7;p\u0012")), method5505(method5504("P7;\bSI)a\n\u0012")), method5505(method5504("I5yX")), method5505(method5504("\\n;\u001aG")), method5505(method5504("P7;v\u0012")), method5505(method5504("P7;w\u0012"))};
   @OriginalMember(
      owner = "client!ww",
      name = "e",
      descriptor = "I"
   )
   public static int field11037 = 0;
   @OriginalMember(
      owner = "client!ww",
      name = "c",
      descriptor = "I"
   )
   public static int field11033;
   @OriginalMember(
      owner = "client!ww",
      name = "h",
      descriptor = "I"
   )
   public static int field11034;
   @OriginalMember(
      owner = "client!ww",
      name = "f",
      descriptor = "I"
   )
   public static int field11035;
   @OriginalMember(
      owner = "client!ww",
      name = "g",
      descriptor = "I"
   )
   public static int field11038;
   @OriginalMember(
      owner = "client!ww",
      name = "i",
      descriptor = "I"
   )
   public static int field11040;

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5500(int arg0) {
      try {
         ++field11035;
         if (arg0 != 16) {
            this.method5500(-83);
         }

         class179 var2 = this.field11039;
         synchronized(this.field11039) {
            this.field11039.method1589((byte)69);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11041[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(II)Lbha;"
   )
   public final class598 method5501(int arg0, int arg1) {
      try {
         ++field11040;
         class179 var3 = this.field11039;
         class598 var4;
         synchronized(this.field11039) {
            var4 = (class598)this.field11039.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field11032;
            byte[] var6;
            synchronized(this.field11032) {
               if (arg0 != 15192) {
                  this.field11032 = null;
               }

               var6 = this.field11032.method1347((byte)122, 16, arg1);
            }

            class598 var7 = new class598();
            if (var6 != null) {
               var7.method4417((byte)122, new class473(var6));
            }

            class179 var8 = this.field11039;
            synchronized(this.field11039) {
               this.field11039.method1581((long)arg1, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field11041[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method5502(boolean arg0, int arg1) {
      try {
         ++field11033;
         class179 var3 = this.field11039;
         synchronized(this.field11039) {
            this.field11039.method1579(83, arg1);
            if (!arg0) {
               this.method5500(80);
            }

         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11041[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5503(byte arg0) {
      try {
         ++field11034;
         class179 var2 = this.field11039;
         synchronized(this.field11039) {
            this.field11039.method1591((byte)58);
            int var3 = -54 / ((arg0 - 65) / 40);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11041[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V"
   )
   public class761(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field11032 = arg2;
         if (this.field11032 != null) {
            this.field11036 = this.field11032.method1346(16, 0);
         } else {
            this.field11036 = 0;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11041[2] + (arg0 != null ? field11041[4] : field11041[3]) + ',' + arg1 + ',' + (arg2 != null ? field11041[4] : field11041[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5504(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ww",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5505(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
