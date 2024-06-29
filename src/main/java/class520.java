import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class520 {
   @OriginalMember(
      owner = "client!ea",
      name = "j",
      descriptor = "Llj;"
   )
   private class304 field7901 = new class304(64);
   @OriginalMember(
      owner = "client!ea",
      name = "d",
      descriptor = "Llj;"
   )
   public class304 field7911 = new class304(64);
   @OriginalMember(
      owner = "client!ea",
      name = "l",
      descriptor = "Lrr;"
   )
   private class678 field7909;
   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "Lrr;"
   )
   public class678 field7905;
   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7912 = new String[]{method4018(method4017("?{ d\u0015")), method4018(method4017("?{ h\u0015")), method4018(method4017("?{ e\u0015")), method4018(method4017("?{ b\u0015")), method4018(method4017("?{ f\u0015")), method4018(method4017("?{ g\u0015")), method4018(method4017("?{ a\u0015")), method4018(method4017("?{ \u001cT4sz\u001e\u0015")), method4018(method4017("4obL")), method4018(method4017("!4 \u000e@"))};
   @OriginalMember(
      owner = "client!ea",
      name = "k",
      descriptor = "I"
   )
   public static int field7902 = 0;
   @OriginalMember(
      owner = "client!ea",
      name = "e",
      descriptor = "I"
   )
   public static int field7899;
   @OriginalMember(
      owner = "client!ea",
      name = "h",
      descriptor = "I"
   )
   public static int field7900;
   @OriginalMember(
      owner = "client!ea",
      name = "i",
      descriptor = "I"
   )
   public static int field7903;
   @OriginalMember(
      owner = "client!ea",
      name = "m",
      descriptor = "I"
   )
   public static int field7904;
   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "I"
   )
   public static int field7908;
   @OriginalMember(
      owner = "client!ea",
      name = "f",
      descriptor = "I"
   )
   public static int field7910;
   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "Lrr;"
   )
   public static class678 field7906;
   @OriginalMember(
      owner = "client!ea",
      name = "g",
      descriptor = "[[[B"
   )
   public static byte[][][] field7907;

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(II)Lrp;",
      line = 4
   )
   public final class287 method4009(int arg0, int arg1) {
      try {
         ++field7904;
         class304 var3 = this.field7901;
         class287 var4;
         synchronized(this.field7901) {
            var4 = (class287)this.field7901.method2544(false, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field7909;
            byte[] var6;
            synchronized(this.field7909) {
               var6 = this.field7909.method5017(34, arg0, (byte)71);
               int var7 = 36 % ((arg1 - -49) / 35);
            }

            class287 var8 = new class287();
            var8.field4507 = this;
            if (var6 != null) {
               var8.method2398(new class354(var6), -1);
            }

            class304 var9 = this.field7901;
            synchronized(this.field7901) {
               this.field7901.method2545((long)arg0, 123, var8);
               return var8;
            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field7912[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "([Lbaa;II)V",
      line = 37
   )
   public static final void method4010(class109[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class109 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field1498;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field1498 > (var7 & 1) + var6) {
               class109 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method4010(arg0, arg1, var4 - 1);
         method4010(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(III)V",
      line = 76
   )
   public final void method4011(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 14906) {
            this.method4014(106);
         }

         ++field7903;
         this.field7901 = new class304(arg2);
         this.field7911 = new class304(arg0);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7912[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IB)V",
      line = 91
   )
   public final void method4012(int arg0, byte arg1) {
      try {
         class304 var3 = this.field7901;
         synchronized(this.field7901) {
            this.field7901.method2552(arg0, 21533);
         }

         int var4 = -27 / ((arg1 - 34) / 57);
         ++field7900;
         class304 var5 = this.field7911;
         synchronized(this.field7911) {
            this.field7911.method2552(arg0, 21533);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field7912[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(I)V",
      line = 108
   )
   public final void method4013(int arg0) {
      try {
         class304 var2 = this.field7901;
         synchronized(this.field7901) {
            if (arg0 != -31541) {
               method4015(13);
            }

            this.field7901.method2554(-105);
         }

         ++field7899;
         class304 var3 = this.field7911;
         synchronized(this.field7911) {
            this.field7911.method2554(-100);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7912[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "d",
      descriptor = "(I)V",
      line = 125
   )
   public final void method4014(int arg0) {
      try {
         ++field7910;
         class304 var2 = this.field7901;
         synchronized(this.field7901) {
            this.field7901.method2551(true);
            if (arg0 != 1) {
               this.method4011(-84, 57, -126);
            }
         }

         class304 var3 = this.field7911;
         synchronized(this.field7911) {
            this.field7911.method2551(true);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7912[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(I)V",
      line = 149
   )
   public static void method4015(int arg0) {
      try {
         field7907 = null;
         field7906 = null;
         if (arg0 != 26861) {
            method4010((class109[])null, -16, 87);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7912[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "<init>",
      descriptor = "(Ltv;ILrr;Lrr;)V",
      line = 188
   )
   public class520(class311 arg0, int arg1, class678 arg2, class678 arg3) {
      try {
         this.field7909 = arg2;
         this.field7905 = arg3;
         this.field7909.method4998((byte)-82, 34);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7912[7] + (arg0 != null ? field7912[9] : field7912[8]) + ',' + arg1 + ',' + (arg2 != null ? field7912[9] : field7912[8]) + ',' + (arg3 != null ? field7912[9] : field7912[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "(I)V",
      line = 165
   )
   public static final void method4016(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field7908;
         class332 var2 = (class332)class570.field8426.method3139(-62);
         if (var1) {
            class299.method2505(20, var2.field5033);
            var2 = (class332)class570.field8426.method3147(-21068);
         }

         while(true) {
            int var10000;
            int var10001;
            if (var2 == null) {
               var10000 = arg0;
               var10001 = 2;
               if (!var1) {
                  if (arg0 != 2) {
                     field7902 = -82;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = 20;
               var10001 = var2.field5033;
            }

            class299.method2505(var10000, var10001);
            var2 = (class332)class570.field8426.method3147(-21068);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7912[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4017(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4018(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
