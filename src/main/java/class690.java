import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class690 {
   @OriginalMember(
      owner = "client!gha",
      name = "e",
      descriptor = "Lsia;"
   )
   private class407 field10144 = new class407(64);
   @OriginalMember(
      owner = "client!gha",
      name = "c",
      descriptor = "Lsia;"
   )
   public class407 field10148 = new class407(2);
   @OriginalMember(
      owner = "client!gha",
      name = "b",
      descriptor = "Lww;"
   )
   public class339 field10140;
   @OriginalMember(
      owner = "client!gha",
      name = "f",
      descriptor = "Lww;"
   )
   private class339 field10141;
   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10149 = new String[]{method5043(method5042("#D[\u0017")), method5043(method5042("6\u001f\u0019UO")), method5043(method5042("*YVU\u000e$_^\u000f\fe")), method5043(method5042("*YVUse")), method5043(method5042("*YVUqe")), method5043(method5042("*YVUve")), method5043(method5042("*YVUpe"))};
   @OriginalMember(
      owner = "client!gha",
      name = "d",
      descriptor = "I"
   )
   public static int field10142 = 100;
   @OriginalMember(
      owner = "client!gha",
      name = "h",
      descriptor = "I"
   )
   public static int field10143;
   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "I"
   )
   public static int field10145;
   @OriginalMember(
      owner = "client!gha",
      name = "i",
      descriptor = "I"
   )
   public static int field10146;
   @OriginalMember(
      owner = "client!gha",
      name = "g",
      descriptor = "I"
   )
   public static int field10147;

   @OriginalMember(
      owner = "client!gha",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method5038(byte arg0) {
      try {
         class407 var2 = this.field10144;
         synchronized(this.field10144) {
            this.field10144.method3201((byte)109);
         }

         ++field10147;
         class407 var3 = this.field10148;
         synchronized(this.field10148) {
            this.field10148.method3201((byte)103);
         }

         int var4 = 127 / ((46 - arg0) / 63);
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10149[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(BI)Loaa;"
   )
   public final class559 method5039(byte arg0, int arg1) {
      try {
         ++field10146;
         class407 var3 = this.field10144;
         class559 var4;
         synchronized(this.field10144) {
            var4 = (class559)this.field10144.method3192((long)arg1, (byte)-116);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field10141;
            byte[] var6;
            synchronized(this.field10141) {
               var6 = this.field10141.method2697(arg1, 33, false);
            }

            class559 var7 = new class559();
            var7.field8184 = this;
            if (var6 != null) {
               var7.method4215((byte)54, new class66(var6));
            }

            class407 var8 = this.field10144;
            synchronized(this.field10144) {
               this.field10144.method3190(var7, (long)arg1, 8);
               if (arg0 != 30) {
                  this.field10144 = null;
               }

               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field10149[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5040(byte arg0) {
      try {
         if (arg0 <= -9) {
            ++field10145;
            class407 var2 = this.field10144;
            synchronized(this.field10144) {
               this.field10144.method3187(-23825);
            }

            class407 var3 = this.field10148;
            synchronized(this.field10148) {
               this.field10148.method3187(-23825);
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10149[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5041(int arg0, int arg1) {
      try {
         class407 var3 = this.field10144;
         synchronized(this.field10144) {
            this.field10144.method3197(5, arg0);
            if (arg1 != -324) {
               this.field10144 = null;
            }
         }

         ++field10143;
         class407 var4 = this.field10148;
         synchronized(this.field10148) {
            this.field10148.method3197(arg1 ^ -327, arg0);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10149[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "<init>",
      descriptor = "(Lkb;ILww;Lww;)V"
   )
   public class690(class500 arg0, int arg1, class339 arg2, class339 arg3) {
      try {
         this.field10140 = arg3;
         this.field10141 = arg2;
         this.field10141.method2691(33, -42);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10149[2] + (arg0 != null ? field10149[1] : field10149[0]) + ',' + arg1 + ',' + (arg2 != null ? field10149[1] : field10149[0]) + ',' + (arg3 != null ? field10149[1] : field10149[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5042(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5043(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
