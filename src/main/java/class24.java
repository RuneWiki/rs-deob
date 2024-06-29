import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class24 {
   @OriginalMember(
      owner = "client!vha",
      name = "e",
      descriptor = "Lsia;"
   )
   private class407 field377 = new class407(128);
   @OriginalMember(
      owner = "client!vha",
      name = "c",
      descriptor = "Lww;"
   )
   private class339 field381;
   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field385 = new String[]{method200(method199("A,7\u0007p")), method200(method199("TwuE")), method200(method199("Ljx\u0007O\u0012")), method200(method199("Ljx\u0007L\u0012")), method200(method199("Ljx\u0007N\u0012")), method200(method199("Ljx\u00071Slp]3\u0012")), method200(method199("Ljx\u0007H\u0012")), method200(method199("Ljx\u0007I\u0012")), method200(method199("Ljx\u0007K\u0012"))};
   @OriginalMember(
      owner = "client!vha",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field374 = new int[25];
   @OriginalMember(
      owner = "client!vha",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field380 = new int[2];
   @OriginalMember(
      owner = "client!vha",
      name = "g",
      descriptor = "I"
   )
   public static int field384 = 1339;
   @OriginalMember(
      owner = "client!vha",
      name = "k",
      descriptor = "Laka;"
   )
   public static class418 field375 = new class418(140, -1);
   @OriginalMember(
      owner = "client!vha",
      name = "h",
      descriptor = "I"
   )
   public static int field376;
   @OriginalMember(
      owner = "client!vha",
      name = "i",
      descriptor = "I"
   )
   public static int field378;
   @OriginalMember(
      owner = "client!vha",
      name = "b",
      descriptor = "I"
   )
   public static int field379;
   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "I"
   )
   public static int field382;
   @OriginalMember(
      owner = "client!vha",
      name = "j",
      descriptor = "I"
   )
   public static int field383;

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(ZI)Lqca;"
   )
   public final class367 method193(boolean arg0, int arg1) {
      try {
         ++field382;
         class407 var3 = this.field377;
         class367 var4;
         synchronized(this.field377) {
            var4 = (class367)this.field377.method3192((long)arg1, (byte)-113);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field381;
            byte[] var6;
            synchronized(this.field381) {
               var6 = this.field381.method2697(arg1, 1, false);
            }

            class367 var7 = new class367();
            if (var6 != null) {
               var7.method2895(-1, new class66(var6));
            }

            class407 var8 = this.field377;
            synchronized(this.field377) {
               this.field377.method3190(var7, (long)arg1, 8);
            }

            if (!arg0) {
               this.field381 = null;
            }

            return var7;
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field385[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method194(int arg0) {
      try {
         class407 var2 = this.field377;
         synchronized(this.field377) {
            this.field377.method3201((byte)125);
         }

         if (arg0 != -1) {
            this.method194(102);
         }

         ++field376;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field385[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method195(int arg0, int arg1) {
      try {
         if (arg1 != -19321) {
            method197(68);
         }

         ++field378;
         class407 var3 = this.field377;
         synchronized(this.field377) {
            this.field377.method3197(5, arg0);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field385[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method196(int arg0) {
      try {
         ++field383;
         class407 var2 = this.field377;
         synchronized(this.field377) {
            this.field377.method3187(-23825);
         }

         if (arg0 != 20000) {
            this.method193(false, 79);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field385[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method197(int arg0) {
      try {
         if (arg0 != 13003) {
            method198((byte[])null, false, 63);
         }

         field375 = null;
         field380 = null;
         field374 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field385[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "([BZI)V"
   )
   public static final void method198(byte[] arg0, boolean arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         if (arg2 != 20000) {
            method198((byte[])null, false, -62);
         }

         if (class116.field1531 == null) {
            class116.field1531 = new class66(20000);
         }

         ++field379;
         class116.field1531.method601(99, arg0.length, 0, arg0);
         if (arg1) {
            class221.method1778(-3, class116.field1531.field859);
            class426.field5795 = new class111[class54.field744];
            int var4 = 0;
            int var5 = class503.field6992;
            class111 var6;
            if (var3) {
               var6 = class329.method2615((byte)113, var5);
               if (var6 != null) {
                  class426.field5795[var4++] = var6;
               }

               ++var5;
            }

            while(true) {
               byte var10000;
               if (~var5 < ~class568.field8356) {
                  class56.field750 = false;
                  var10000 = -124;
                  if (!var3) {
                     class32.field468 = class163.method1353(-124);
                     class116.field1531 = null;
                     return;
                  }
               } else {
                  var10000 = 113;
               }

               var6 = class329.method2615(var10000, var5);
               if (var6 != null) {
                  class426.field5795[var4++] = var6;
               }

               ++var5;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field385[2] + (arg0 != null ? field385[0] : field385[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class24(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field381 = arg2;
         this.field381.method2691(1, 126);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field385[5] + (arg0 != null ? field385[0] : field385[1]) + ',' + arg1 + ',' + (arg2 != null ? field385[0] : field385[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method199(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method200(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
