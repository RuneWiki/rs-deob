import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class355 implements Runnable {
   @OriginalMember(
      owner = "client!lda",
      name = "k",
      descriptor = "Lom;"
   )
   private class722 field5252;
   @OriginalMember(
      owner = "client!lda",
      name = "g",
      descriptor = "Z"
   )
   private boolean field5253;
   @OriginalMember(
      owner = "client!lda",
      name = "c",
      descriptor = "I"
   )
   public int field5254;
   @OriginalMember(
      owner = "client!lda",
      name = "f",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field5255;
   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5256 = new String[]{method2796(method2795("rR|$2")), method2796(method2795("e\u00183$\n!")), method2796(method2795("g\t>f")), method2796(method2795("e\u00183$\t!")), method2796(method2795("e\u00183$\u000e!")), method2796(method2795("e\u00183$\r!")), method2796(method2795("e\u00183$\u000b!")), method2796(method2795("e\u00183$\f!")), method2796(method2795("e\u00183$=|\u0012z")), method2796(method2795("e\u00183$s`\u0012;~q!"))};
   @OriginalMember(
      owner = "client!lda",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field5249 = false;
   @OriginalMember(
      owner = "client!lda",
      name = "i",
      descriptor = "D"
   )
   public static double field5248;
   @OriginalMember(
      owner = "client!lda",
      name = "l",
      descriptor = "I"
   )
   public static int field5243;
   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "I"
   )
   public static int field5244;
   @OriginalMember(
      owner = "client!lda",
      name = "h",
      descriptor = "I"
   )
   public static int field5245;
   @OriginalMember(
      owner = "client!lda",
      name = "e",
      descriptor = "I"
   )
   public static int field5246;
   @OriginalMember(
      owner = "client!lda",
      name = "d",
      descriptor = "I"
   )
   public static int field5247;
   @OriginalMember(
      owner = "client!lda",
      name = "j",
      descriptor = "I"
   )
   public static int field5250;
   @OriginalMember(
      owner = "client!lda",
      name = "b",
      descriptor = "I"
   )
   public static int field5251;

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "([BBLql;I)Ltja;"
   )
   public final class51 method2789(byte[] arg0, byte arg1, class717 arg2, int arg3) {
      try {
         ++field5244;
         class51 var5 = new class51();
         var5.field761 = arg2;
         var5.field765 = 2;
         var5.field6491 = false;
         var5.field766 = arg0;
         var5.field1548 = (long)arg3;
         this.method2793(var5, (byte)68);
         int var6 = 24 % ((22 - arg1) / 45);
         return var5;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field5256[6] + (arg0 != null ? field5256[0] : field5256[2]) + ',' + arg1 + ',' + (arg2 != null ? field5256[0] : field5256[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2790(int arg0) {
      try {
         this.field5253 = true;
         ++field5243;
         class722 var2 = this.field5252;
         synchronized(this.field5252) {
            this.field5252.notifyAll();
         }

         try {
            this.field5255.join();
         } catch (InterruptedException var4) {
         }

         if (arg0 != 2) {
            this.field5254 = -111;
         }

         this.field5255 = null;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5256[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(Z)I"
   )
   public static final int method2791(boolean arg0) {
      try {
         if (arg0) {
            method2791(false);
         }

         ++field5245;
         return class340.field5011;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5256[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(IILql;)Ltja;"
   )
   public final class51 method2792(int param1, int param2, class717 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(Ltja;B)V"
   )
   private final void method2793(class51 arg0, byte arg1) {
      try {
         class722 var3 = this.field5252;
         synchronized(this.field5252) {
            if (arg1 != 68) {
               this.run();
            }

            this.field5252.method5224(arg0, 94);
            ++this.field5254;
            this.field5252.notifyAll();
         }

         ++field5247;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5256[7] + (arg0 != null ? field5256[0] : field5256[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(ILql;I)Ltja;"
   )
   public final class51 method2794(int arg0, class717 arg1, int arg2) {
      try {
         ++field5251;
         class51 var4 = new class51();
         var4.field765 = 3;
         var4.field6491 = false;
         var4.field1548 = (long)arg2;
         var4.field761 = arg1;
         int var5 = -4 / ((-45 - arg0) / 58);
         this.method2793(var4, (byte)68);
         return var4;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5256[1] + arg0 + ',' + (arg1 != null ? field5256[0] : field5256[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "<init>",
      descriptor = "(Lfea;)V"
   )
   public class355(class82 arg0) {
      boolean var2 = client.field10022;
      super();
      this.field5252 = new class722();
      this.field5253 = false;
      this.field5254 = 0;

      try {
         class92 var3 = arg0.method883(5, this, -5);
         if (var2) {
            class97.method968(32353, 10L);
         }

         while(true) {
            int var10000;
            if (var3.field1526 != 0) {
               var10000 = var3.field1526;
               if (!var2) {
                  if (var10000 == 2) {
                     throw new RuntimeException();
                  }

                  this.field5255 = (Thread)var3.field1525;
                  return;
               }
            } else {
               var10000 = 32353;
            }

            class97.method968(var10000, 10L);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5256[9] + (arg0 != null ? field5256[0] : field5256[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2795(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2796(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
