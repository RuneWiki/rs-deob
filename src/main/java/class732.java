import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class732 {
   @OriginalMember(
      owner = "client!no",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public String field10709;
   @OriginalMember(
      owner = "client!no",
      name = "c",
      descriptor = "I"
   )
   public int field10710;
   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10715 = new String[]{method5330(method5329(",t\u0011\u0002=\u0011oM\u001f<%3")), method5330(method5329(",t\u00117z")), method5330(method5329(",nS\u001a")), method5330(method5329("95\u0011X/")), method5330(method5329(",t\u0011J;,rKHz"))};
   @OriginalMember(
      owner = "client!no",
      name = "d",
      descriptor = "I"
   )
   public static int field10711 = 0;
   @OriginalMember(
      owner = "client!no",
      name = "f",
      descriptor = "I"
   )
   public static int field10714 = -1;
   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "I"
   )
   public static int field10712;
   @OriginalMember(
      owner = "client!no",
      name = "b",
      descriptor = "I"
   )
   public static int field10713;

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(JZ)V",
      line = 4
   )
   public static final void method5328(long arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         ++field10712;
         int var4 = class760.field11239;
         int var5 = class157.field2236;
         if (class725.field10585 != var4) {
            int var7;
            label81: {
               int var6 = var4 - class725.field10585;
               var7 = (int)((long)var6 * arg0 / 320L);
               if (~var6 < -1) {
                  if (~var7 != -1) {
                     if (var7 <= var6) {
                        break label81;
                     }

                     var7 = var6;
                     if (!var3) {
                        break label81;
                     }
                  }

                  var7 = 1;
                  if (!var3) {
                     break label81;
                  }
               }

               if (~var7 != -1) {
                  if (~var7 <= ~var6) {
                     break label81;
                  }

                  var7 = var6;
                  if (!var3) {
                     break label81;
                  }
               }

               var7 = -1;
            }

            class725.field10585 += var7;
         }

         class117.field1467 += (float)arg0 * class718.field10477 / 40.0F * 8.0F;
         if (~class310.field4257 != ~var5) {
            int var9;
            label82: {
               int var8 = -class310.field4257 + var5;
               var9 = (int)((long)var8 * arg0 / 320L);
               if (~var8 >= -1) {
                  if (~var9 == -1) {
                     var9 = -1;
                     if (!var3) {
                        break label82;
                     }
                  }

                  if (~var8 >= ~var9) {
                     break label82;
                  }

                  var9 = var8;
                  if (!var3) {
                     break label82;
                  }
               }

               if (~var9 != -1) {
                  if (~var9 >= ~var8) {
                     break label82;
                  }

                  var9 = var8;
                  if (!var3) {
                     break label82;
                  }
               }

               var9 = 1;
            }

            class310.field4257 += var9;
         }

         class273.field3753 += (float)arg0 * class480.field6887 / 40.0F * 8.0F;
         if (!arg1) {
            field10714 = 2;
         }

         class591.method4298(262144);
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field10715[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 87
   )
   public final String toString() {
      try {
         ++field10713;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10715[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      line = 110
   )
   public class732(String arg0, String arg1, int arg2) {
      try {
         this.field10709 = arg0;
         this.field10710 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10715[4] + (arg0 != null ? field10715[3] : field10715[2]) + ',' + (arg1 != null ? field10715[3] : field10715[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5329(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5330(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
