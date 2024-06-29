import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class708 {
   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "Loi;"
   )
   private class80 field10338 = new class80(64);
   @OriginalMember(
      owner = "client!gi",
      name = "g",
      descriptor = "Lkf;"
   )
   private class266 field10344;
   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10345 = new String[]{method5155(method5154("\u000b/!{2")), method5155(method5154("\u000b/!}2")), method5155(method5154("\u000b/!|2")), method5155(method5154("\u000b/!~2")), method5155(method5154("\u000b/!\u0006s\u0002/{\u00042")), method5155(method5154("\u0017h!\u0014g")), method5155(method5154("\u00023cV")), method5155(method5154("\u000b/!r2")), method5155(method5154("\u000b/!x2")), method5155(method5154("\u000b/!y2"))};
   @OriginalMember(
      owner = "client!gi",
      name = "i",
      descriptor = "[Ldu;"
   )
   public static class377[] field10336 = new class377[16];
   @OriginalMember(
      owner = "client!gi",
      name = "b",
      descriptor = "I"
   )
   public static int field10343 = 0;
   @OriginalMember(
      owner = "client!gi",
      name = "h",
      descriptor = "Loba;"
   )
   public static class274 field10339 = new class274();
   @OriginalMember(
      owner = "client!gi",
      name = "f",
      descriptor = "I"
   )
   public static int field10334;
   @OriginalMember(
      owner = "client!gi",
      name = "c",
      descriptor = "I"
   )
   public static int field10335;
   @OriginalMember(
      owner = "client!gi",
      name = "k",
      descriptor = "I"
   )
   public static int field10337;
   @OriginalMember(
      owner = "client!gi",
      name = "d",
      descriptor = "I"
   )
   public static int field10340;
   @OriginalMember(
      owner = "client!gi",
      name = "e",
      descriptor = "I"
   )
   public static int field10341;
   @OriginalMember(
      owner = "client!gi",
      name = "j",
      descriptor = "I"
   )
   public static int field10342;

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(Lgn;III)V"
   )
   public static final void method5146(class731 arg0, int arg1, int arg2, int arg3) {
      if (arg2 < class457.field6539) {
         class517 var4 = class663.field9659[arg1][arg2 + 1][arg3];
         if (var4 != null && var4.field7464 != null && var4.field7464.method239(true)) {
            arg0.method233(class80.field1038, true, var4.field7464, 0, class729.field10681, 0, -126);
         }
      }

      if (arg3 < class457.field6539) {
         class517 var5 = class663.field9659[arg1][arg2][arg3 + 1];
         if (var5 != null && var5.field7464 != null && var5.field7464.method239(true)) {
            arg0.method233(class80.field1038, true, var5.field7464, class729.field10681, 0, 0, -128);
         }
      }

      if (arg2 < class457.field6539 && arg3 < class16.field190) {
         class517 var6 = class663.field9659[arg1][arg2 + 1][arg3 + 1];
         if (var6 != null && var6.field7464 != null && var6.field7464.method239(true)) {
            arg0.method233(class80.field1038, true, var6.field7464, class729.field10681, class729.field10681, 0, -126);
         }
      }

      if (arg2 < class457.field6539 && arg3 > 0) {
         class517 var7 = class663.field9659[arg1][arg2 + 1][arg3 - 1];
         if (var7 != null && var7.field7464 != null && var7.field7464.method239(true)) {
            arg0.method233(class80.field1038, true, var7.field7464, -class729.field10681, class729.field10681, 0, -127);
         }
      }

   }

   @OriginalMember(
      owner = "client!gi",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method5147(boolean arg0) {
      try {
         ++field10337;
         class80 var2 = this.field10338;
         synchronized(this.field10338) {
            this.field10338.method731(0);
         }

         if (!arg0) {
            this.method5148(32);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10345[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5148(int arg0) {
      try {
         class80 var2 = this.field10338;
         synchronized(this.field10338) {
            this.field10338.method715(true);
         }

         ++field10334;
         if (arg0 != -19728) {
            method5153(false);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10345[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5149(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 458752) {
            return true;
         } else {
            ++field10340;
            return class316.method2321(arg2, arg0 + -457728, arg1) | (arg2 & 458752) != 0 || class197.method1553(arg1, arg0 + -458752, arg2);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10345[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5150(int arg0, int arg1) {
      try {
         ++field10342;
         class80 var3 = this.field10338;
         synchronized(this.field10338) {
            if (arg0 != -7836) {
               field10343 = -85;
            }

            this.field10338.method726(arg1, arg0 ^ -31864);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10345[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method5151(int param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(BI)Llk;"
   )
   public final class614 method5152(byte arg0, int arg1) {
      try {
         ++field10335;
         class80 var3 = this.field10338;
         class614 var4;
         synchronized(this.field10338) {
            var4 = (class614)this.field10338.method725(0, (long)arg1);
            if (arg0 != -65) {
               field10339 = null;
            }
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field10344;
            byte[] var6;
            synchronized(this.field10344) {
               var6 = this.field10344.method2037(false, arg1, 31);
            }

            class614 var7 = new class614();
            if (var6 != null) {
               var7.method4465(0, new class147(var6));
            }

            class80 var8 = this.field10338;
            synchronized(this.field10338) {
               this.field10338.method723(0, (long)arg1, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field10345[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5153(boolean arg0) {
      try {
         if (!arg0) {
            field10343 = 31;
         }

         field10339 = null;
         field10336 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10345[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "<init>",
      descriptor = "(Lno;ILkf;)V"
   )
   public class708(class732 arg0, int arg1, class266 arg2) {
      try {
         this.field10344 = arg2;
         this.field10344.method2060(2, 31);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10345[4] + (arg0 != null ? field10345[5] : field10345[6]) + ',' + arg1 + ',' + (arg2 != null ? field10345[5] : field10345[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5154(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5155(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
