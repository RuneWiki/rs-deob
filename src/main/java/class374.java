import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class374 {
   @OriginalMember(
      owner = "client!ws",
      name = "e",
      descriptor = "I"
   )
   private int field5557;
   @OriginalMember(
      owner = "client!ws",
      name = "f",
      descriptor = "[Lsb;"
   )
   private class305[] field5551;
   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5561 = new String[]{method2930(method2929(",\u0014\u000fT2")), method2930(method2929(",\u0014\u000f,s5\u000eU.2")), method2930(method2929(",\u0014\u000fS2")), method2930(method2929(" I\u000f>g")), method2930(method2929(",\u0014\u000fR2")), method2930(method2929("5\u0012M|")), method2930(method2929(",\u0014\u000fU2")), method2930(method2929(",\u0014\u000fQ2"))};
   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "Luw;"
   )
   public static class435 field5554 = new class435(66, -1);
   @OriginalMember(
      owner = "client!ws",
      name = "h",
      descriptor = "I"
   )
   public static int field5552;
   @OriginalMember(
      owner = "client!ws",
      name = "b",
      descriptor = "I"
   )
   public static int field5553;
   @OriginalMember(
      owner = "client!ws",
      name = "d",
      descriptor = "I"
   )
   public static int field5555;
   @OriginalMember(
      owner = "client!ws",
      name = "i",
      descriptor = "I"
   )
   public static int field5558;
   @OriginalMember(
      owner = "client!ws",
      name = "j",
      descriptor = "I"
   )
   public static int field5559;
   @OriginalMember(
      owner = "client!ws",
      name = "g",
      descriptor = "J"
   )
   private long field5560;
   @OriginalMember(
      owner = "client!ws",
      name = "c",
      descriptor = "Lsb;"
   )
   private class305 field5556;

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(BJLsb;)V",
      line = 9
   )
   public final void method2924(byte arg0, long arg1, class305 arg2) {
      try {
         if (arg0 != 46) {
            this.method2928((byte)85);
         }

         ++field5558;
         if (arg2.field4408 != null) {
            arg2.method2385(117);
         }

         class305 var5 = this.field5551[(int)((long)(this.field5557 - 1) & arg1)];
         arg2.field4412 = var5;
         arg2.field4408 = var5.field4408;
         arg2.field4408.field4412 = arg2;
         arg2.field4416 = arg1;
         arg2.field4412.field4408 = arg2;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5561[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5561[3] : field5561[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(Z)V",
      line = 35
   )
   public static void method2925(boolean arg0) {
      try {
         field5554 = null;
         if (arg0) {
            method2926(126);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5561[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(I)V",
      line = 54
   )
   public static final void method2926(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(JB)Lsb;",
      line = 79
   )
   public final class305 method2927(long arg0, byte arg1) {
      boolean var4 = client.field4564;

      try {
         ++field5559;
         this.field5560 = arg0;
         if (arg1 <= 56) {
            this.method2928((byte)-2);
         }

         class305 var5 = this.field5551[(int)(arg0 & (long)(this.field5557 + -1))];
         this.field5556 = var5.field4412;
         class305 var6;
         if (var4) {
            if (~this.field5556.field4416 == ~arg0) {
               var6 = this.field5556;
               this.field5556 = this.field5556.field4412;
               return var6;
            }

            this.field5556 = this.field5556.field4412;
         }

         while(true) {
            while(this.field5556 != var5) {
               if (~this.field5556.field4416 == ~arg0) {
                  var6 = this.field5556;
                  this.field5556 = this.field5556.field4412;
                  return var6;
               }

               this.field5556 = this.field5556.field4412;
            }

            this.field5556 = null;
            if (!var4) {
               return null;
            }

            this.field5556 = this.field5556.field4412;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5561[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(B)Lsb;",
      line = 109
   )
   public final class305 method2928(byte arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 != -82) {
            this.method2928((byte)-22);
         }

         ++field5553;
         if (this.field5556 == null) {
            return null;
         } else {
            class305 var3 = this.field5551[(int)(this.field5560 & (long)(this.field5557 + -1))];
            class305 var4;
            if (var2) {
               if (~this.field5556.field4416 == ~this.field5560) {
                  var4 = this.field5556;
                  this.field5556 = this.field5556.field4412;
                  return var4;
               }

               this.field5556 = this.field5556.field4412;
            }

            while(true) {
               while(this.field5556 != var3) {
                  if (~this.field5556.field4416 == ~this.field5560) {
                     var4 = this.field5556;
                     this.field5556 = this.field5556.field4412;
                     return var4;
                  }

                  this.field5556 = this.field5556.field4412;
               }

               this.field5556 = null;
               if (!var2) {
                  return null;
               }

               this.field5556 = this.field5556.field4412;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5561[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "<init>",
      descriptor = "(I)V",
      line = 143
   )
   public class374(int arg0) {
      try {
         this.field5557 = arg0;
         this.field5551 = new class305[arg0];

         for(int var2 = 0; var2 < arg0; ++var2) {
            class305 var3 = this.field5551[var2] = new class305();
            var3.field4412 = var3;
            var3.field4408 = var3;
         }

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5561[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2929(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2930(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
