import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class625 {
   @OriginalMember(
      owner = "client!qw",
      name = "d",
      descriptor = "B"
   )
   private byte field9233;
   @OriginalMember(
      owner = "client!qw",
      name = "g",
      descriptor = "I"
   )
   public int field9241;
   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "I"
   )
   public int field9237;
   @OriginalMember(
      owner = "client!qw",
      name = "h",
      descriptor = "I"
   )
   public int field9240;
   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "I"
   )
   public int field9235;
   @OriginalMember(
      owner = "client!qw",
      name = "e",
      descriptor = "I"
   )
   public int field9239;
   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9244 = new String[]{method4626(method4625("ne'r|")), method4626(method4625("d<'\u001f)")), method4626(method4625("qge]")), method4626(method4625("ne'u|")), method4626(method4625("ne'p|")), method4626(method4625("ne's|")), method4626(method4625("ne'\r=q{}\u000f|"))};
   @OriginalMember(
      owner = "client!qw",
      name = "k",
      descriptor = "Lsia;"
   )
   public static class407 field9234 = new class407(128, 4);
   @OriginalMember(
      owner = "client!qw",
      name = "i",
      descriptor = "Llia;"
   )
   public static class633 field9242 = new class633(method4626(method4625("HF[r")), method4626(method4625("ptoX7z")), method4626(method4625("@`j")), 1);
   @OriginalMember(
      owner = "client!qw",
      name = "f",
      descriptor = "I"
   )
   public static int field9236;
   @OriginalMember(
      owner = "client!qw",
      name = "c",
      descriptor = "I"
   )
   public static int field9238;
   @OriginalMember(
      owner = "client!qw",
      name = "j",
      descriptor = "I"
   )
   public static int field9243;

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method4621(String arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field9243;
         if (arg0 != null) {
            String var3 = class464.method3533((byte)87, arg0);
            if (var3 != null) {
               int var4 = 0;
               int var5 = 34 / ((arg1 - 29) / 41);
               if (var2 || class202.field2575 > var4) {
                  do {
                     String var6 = class35.field495[var4];
                     String var7 = class464.method3533((byte)87, var6);
                     if (class741.method5379(arg0, var3, var6, var7, (byte)95)) {
                        --class202.field2575;
                        int var8 = var4;
                        if (var2) {
                           class35.field495[var4] = class35.field495[var4 + 1];
                           class193.field2456[var4] = class193.field2456[var4 + 1];
                           class175.field2259[var4] = class175.field2259[var4 + 1];
                           class503.field6983[var4] = class503.field6983[var4 - -1];
                           class162.field2061[var4] = class162.field2061[var4 + 1];
                           class39.field542[var4] = class39.field542[var4 - -1];
                           var8 = var4 + 1;
                        }

                        while(true) {
                           while(class202.field2575 > var8) {
                              class35.field495[var8] = class35.field495[var8 + 1];
                              class193.field2456[var8] = class193.field2456[var8 + 1];
                              class175.field2259[var8] = class175.field2259[var8 + 1];
                              class503.field6983[var8] = class503.field6983[var8 - -1];
                              class162.field2061[var8] = class162.field2061[var8 + 1];
                              class39.field542[var8] = class39.field542[var8 - -1];
                              ++var8;
                           }

                           ++class56.field753;
                           class224.field2809 = class10.field229;
                           class594 var9 = class145.method1177((byte)-35);
                           class702 var10 = class19.method142(var9.field8765, class262.field3324, (byte)-74);
                           var10.field10264.method593(class398.method3129(12, arg0), 867770704);
                           var10.field10264.method595(-15010, arg0);
                           var9.method4423(var10, (byte)103);
                           if (!var2) {
                              return;
                           }

                           ++var8;
                        }
                     }

                     ++var4;
                  } while(class202.field2575 > var4);

               }
            }
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field9244[3] + (arg0 != null ? field9244[1] : field9244[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4622(int arg0) {
      try {
         if (arg0 == 1) {
            field9234 = null;
            field9242 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9244[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method4623(byte arg0) {
      try {
         int var2 = 7 / ((arg0 - -6) / 45);
         ++field9236;
         return ~(8 & this.field9233) == -9 ? 1 : 0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9244[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method4624(boolean arg0) {
      try {
         if (!arg0) {
            field9242 = null;
         }

         ++field9238;
         return this.field9233 & 7;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9244[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "<init>",
      descriptor = "()V"
   )
   public class625() {
   }

   @OriginalMember(
      owner = "client!qw",
      name = "<init>",
      descriptor = "(Lgea;)V"
   )
   public class625(class66 arg0) {
      try {
         this.field9233 = arg0.method628((byte)-12);
         this.field9241 = arg0.method603(-2);
         this.field9237 = arg0.method610(124);
         this.field9240 = arg0.method610(-78);
         this.field9235 = arg0.method610(127);
         this.field9239 = arg0.method610(125);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9244[6] + (arg0 != null ? field9244[1] : field9244[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4625(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4626(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
