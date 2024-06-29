import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class484 {
   @OriginalMember(
      owner = "client!iga",
      name = "b",
      descriptor = "Loi;"
   )
   private class80 field6925 = new class80(64);
   @OriginalMember(
      owner = "client!iga",
      name = "e",
      descriptor = "Lkf;"
   )
   private class266 field6920;
   @OriginalMember(
      owner = "client!iga",
      name = "k",
      descriptor = "I"
   )
   public int field6929;
   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6930 = new String[]{method3515(method3514("\">\u000eX\u0002c")), method3515(method3514("\">\u000eX\u0000c")), method3515(method3514("\">\u000eX\u0006c")), method3515(method3514("\">\u000eX\u0001c")), method3515(method3514("0wAX>")), method3515(method3514("%,\u0003\u001a")), method3515(method3514("\">\u000eX\u007f\"7\u0006\u0002}c")), method3515(method3514("\">\u000eX\u0007c"))};
   @OriginalMember(
      owner = "client!iga",
      name = "c",
      descriptor = "J"
   )
   public static long field6927 = 0L;
   @OriginalMember(
      owner = "client!iga",
      name = "l",
      descriptor = "I"
   )
   public static int field6918;
   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "I"
   )
   public static int field6919;
   @OriginalMember(
      owner = "client!iga",
      name = "i",
      descriptor = "I"
   )
   public static int field6921;
   @OriginalMember(
      owner = "client!iga",
      name = "d",
      descriptor = "I"
   )
   public static int field6924;
   @OriginalMember(
      owner = "client!iga",
      name = "h",
      descriptor = "I"
   )
   public static int field6926;
   @OriginalMember(
      owner = "client!iga",
      name = "f",
      descriptor = "I"
   )
   public static int field6928;
   @OriginalMember(
      owner = "client!iga",
      name = "j",
      descriptor = "[Lnka;"
   )
   public static class311[] field6923;
   @OriginalMember(
      owner = "client!iga",
      name = "g",
      descriptor = "[Lika;"
   )
   public static class451[] field6922;

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3509(boolean arg0) {
      try {
         class80 var2 = this.field6925;
         synchronized(this.field6925) {
            this.field6925.method731(0);
         }

         if (arg0) {
            ++field6928;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6930[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3510(byte arg0) {
      try {
         class80 var2 = this.field6925;
         synchronized(this.field6925) {
            this.field6925.method715(true);
         }

         ++field6921;
         if (arg0 != 6) {
            this.field6920 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6930[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3511(int arg0) {
      try {
         if (arg0 == 0) {
            field6922 = null;
            field6923 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6930[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method3512(byte arg0, int arg1) {
      try {
         ++field6926;
         class80 var3 = this.field6925;
         synchronized(this.field6925) {
            this.field6925.method726(arg1, 25324);
            if (arg0 >= -66) {
               field6923 = null;
            }

         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6930[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(II)Lwp;"
   )
   public final class193 method3513(int arg0, int arg1) {
      try {
         ++field6918;
         class80 var3 = this.field6925;
         class193 var4;
         synchronized(this.field6925) {
            var4 = (class193)this.field6925.method725(arg1 ^ arg1, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field6920;
            byte[] var6;
            synchronized(this.field6920) {
               var6 = this.field6920.method2037(false, arg0, 16);
            }

            class193 var7 = new class193();
            if (var6 != null) {
               var7.method1522((byte)-119, new class147(var6));
            }

            class80 var8 = this.field6925;
            synchronized(this.field6925) {
               this.field6925.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field6930[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V"
   )
   public class484(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field6920 = arg2;
         if (this.field6920 != null) {
            this.field6929 = this.field6920.method2060(2, 16);
         } else {
            this.field6929 = 0;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6930[6] + (arg0 != null ? field6930[4] : field6930[5]) + ',' + arg1 + ',' + (arg2 != null ? field6930[4] : field6930[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3514(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3515(char[] arg0) {
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
            var10005 = 89;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
