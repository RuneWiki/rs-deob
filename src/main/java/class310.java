import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class310 {
   @OriginalMember(
      owner = "client!ff",
      name = "d",
      descriptor = "Lsia;"
   )
   private class407 field4320 = new class407(64);
   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "Lsia;"
   )
   private class407 field4325 = new class407(100);
   @OriginalMember(
      owner = "client!ff",
      name = "f",
      descriptor = "Lww;"
   )
   private class339 field4324;
   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4326 = new String[]{method2477(method2476("7R\u000eY_?]T[\u001e")), method2477(method2476("?AL\t")), method2477(method2476("*\u001a\u000eKK")), method2477(method2476("7R\u000e \u001e")), method2477(method2476("7R\u000e!\u001e")), method2477(method2476("7R\u000e'\u001e")), method2477(method2476("7R\u000e&\u001e")), method2477(method2476("7R\u000e$\u001e"))};
   @OriginalMember(
      owner = "client!ff",
      name = "c",
      descriptor = "I"
   )
   public static int field4318;
   @OriginalMember(
      owner = "client!ff",
      name = "b",
      descriptor = "I"
   )
   public static int field4319;
   @OriginalMember(
      owner = "client!ff",
      name = "e",
      descriptor = "I"
   )
   public static int field4321;
   @OriginalMember(
      owner = "client!ff",
      name = "h",
      descriptor = "I"
   )
   public static int field4322;
   @OriginalMember(
      owner = "client!ff",
      name = "g",
      descriptor = "I"
   )
   public static int field4323;

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2471(byte arg0) {
      try {
         ++field4318;
         class407 var2 = this.field4320;
         synchronized(this.field4320) {
            this.field4320.method3201((byte)103);
         }

         int var3 = 78 % ((arg0 - 17) / 33);
         class407 var4 = this.field4325;
         synchronized(this.field4325) {
            this.field4325.method3201((byte)105);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field4326[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2472(byte arg0) {
      try {
         ++field4322;
         class407 var2 = this.field4320;
         synchronized(this.field4320) {
            this.field4320.method3187(-23825);
         }

         if (arg0 >= -112) {
            this.field4320 = null;
         }

         class407 var3 = this.field4325;
         synchronized(this.field4325) {
            this.field4325.method3187(-23825);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4326[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "b",
      descriptor = "(BI)Lmn;"
   )
   public final class238 method2473(byte arg0, int arg1) {
      try {
         ++field4321;
         class407 var3 = this.field4320;
         class238 var4;
         synchronized(this.field4320) {
            var4 = (class238)this.field4320.method3192((long)arg1, (byte)-109);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (arg0 != 86) {
               this.field4320 = null;
            }

            class339 var5 = this.field4324;
            byte[] var6;
            synchronized(this.field4324) {
               var6 = this.field4324.method2697(class146.method1183(arg1, false), class784.method5663(arg1, -495577497), false);
            }

            class238 var7 = new class238();
            var7.field3025 = arg1;
            var7.field3012 = this;
            if (var6 != null) {
               var7.method1904(new class66(var6), arg0 ^ -22196);
            }

            var7.method1905(false);
            class407 var8 = this.field4320;
            synchronized(this.field4320) {
               this.field4320.method3190(var7, (long)arg1, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field4326[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method2474(byte arg0, int arg1) {
      try {
         class407 var3 = this.field4320;
         synchronized(this.field4320) {
            this.field4320.method3197(5, arg1);
         }

         ++field4319;
         class407 var4 = this.field4325;
         synchronized(this.field4325) {
            this.field4325.method3197(5, arg1);
            if (arg0 != -112) {
               this.field4320 = null;
            }

         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field4326[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "c",
      descriptor = "(BI)Lma;"
   )
   public final class670 method2475(byte arg0, int arg1) {
      try {
         ++field4323;
         int var3 = 58 / ((arg0 - -48) / 50);
         class407 var4 = this.field4325;
         synchronized(this.field4325) {
            class670 var5 = (class670)this.field4325.method3192((long)arg1, (byte)-110);
            if (var5 == null) {
               var5 = new class670(arg1);
               this.field4325.method3190(var5, (long)arg1, 8);
            }

            return !var5.method4887(0) ? null : var5;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field4326[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "<init>",
      descriptor = "(Lkb;ILww;Lww;Lww;)V"
   )
   public class310(class500 arg0, int arg1, class339 arg2, class339 arg3, class339 arg4) {
      try {
         this.field4324 = arg2;
         if (this.field4324 != null) {
            int var6 = -1 + this.field4324.method2703((byte)126);
            this.field4324.method2691(var6, 0);
         }

         class682.method4968(arg4, 2, 32768, arg3);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field4326[0] + (arg0 != null ? field4326[2] : field4326[1]) + ',' + arg1 + ',' + (arg2 != null ? field4326[2] : field4326[1]) + ',' + (arg3 != null ? field4326[2] : field4326[1]) + ',' + (arg4 != null ? field4326[2] : field4326[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2476(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2477(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
