import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class558 extends class243 {
   @OriginalMember(
      owner = "client!ws",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8182 = new String[]{method4210(method4209("l.a@]")), method4210(method4209("l.aG]")), method4210(method4209("l.aH]")), method4210(method4209("`sa\"\b")), method4210(method4209("u(#`")), method4210(method4209("l.aB]")), method4210(method4209("l.aM]")), method4210(method4209("l.aA]"))};
   @OriginalMember(
      owner = "client!ws",
      name = "F",
      descriptor = "Lse;"
   )
   public static class6 field8175 = new class6(67, 11);
   @OriginalMember(
      owner = "client!ws",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field8177 = new int[120];
   @OriginalMember(
      owner = "client!ws",
      name = "G",
      descriptor = "I"
   )
   public static int field8174;
   @OriginalMember(
      owner = "client!ws",
      name = "C",
      descriptor = "I"
   )
   public static int field8176;
   @OriginalMember(
      owner = "client!ws",
      name = "E",
      descriptor = "I"
   )
   public static int field8178;
   @OriginalMember(
      owner = "client!ws",
      name = "I",
      descriptor = "I"
   )
   public static int field8179;
   @OriginalMember(
      owner = "client!ws",
      name = "B",
      descriptor = "I"
   )
   public static int field8180;
   @OriginalMember(
      owner = "client!ws",
      name = "H",
      descriptor = "I"
   )
   public static int field8181;

   @OriginalMember(
      owner = "client!ws",
      name = "h",
      descriptor = "(I)V"
   )
   public static final void method4205(int arg0) {
      boolean var1 = client.field1481;

      try {
         class470.field6471 = 0;
         class728.field10621 = 0;
         ++field8180;
         int var2 = 0;
         int var10000;
         int var10001;
         if (var1) {
            var10000 = var2;
            var10001 = class32.field475;
         } else if (~class674.field9985 >= ~var2) {
            var10000 = arg0;
            var10001 = -56;
            if (!var1) {
               if (arg0 > -56) {
                  method4208((byte)-24);
                  return;
               }

               return;
            }
         } else {
            var10000 = var2;
            var10001 = class32.field475;
         }

         while(true) {
            int var3 = var10000 * var10001;
            int var4 = 0;
            if (var1 || var4 < class32.field475) {
               do {
                  int var5 = var3 + var4;
                  class543.field7934[var5].method1072(class390.field5409 * var4, class139.field1759 * var2, class390.field5409, class139.field1759, 0, 0, true, true);
                  ++var4;
               } while(var4 < class32.field475);
            }

            ++var2;
            if (~class674.field9985 >= ~var2) {
               var10000 = arg0;
               var10001 = -56;
               if (!var1) {
                  if (arg0 > -56) {
                     method4208((byte)-24);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var2;
               var10001 = class32.field475;
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8182[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method4206(byte arg0, int arg1) {
      try {
         if (arg0 != -19) {
            return -18;
         } else {
            ++field8179;
            return arg1 & 127;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8182[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class558(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(IIZ[S[Ljava/lang/String;)V"
   )
   public static final void method4207(int arg0, int arg1, boolean arg2, short[] arg3, String[] arg4) {
      boolean var5 = client.field1481;

      try {
         if (~arg0 > ~arg1) {
            int var6 = (arg0 + arg1) / 2;
            int var7 = arg0;
            String var8 = arg4[var6];
            arg4[var6] = arg4[arg1];
            arg4[arg1] = var8;
            short var9 = arg3[var6];
            arg3[var6] = arg3[arg1];
            arg3[arg1] = var9;
            int var10 = arg0;
            String var11;
            short var12;
            if (var5) {
               if (var8 != null) {
                  if (arg4[arg0] != null) {
                     if (arg4[arg0].compareTo(var8) < (1 & arg0)) {
                        var11 = arg4[arg0];
                        arg4[arg0] = arg4[arg0];
                        arg4[arg0] = var11;
                        var12 = arg3[arg0];
                        arg3[arg0] = arg3[arg0];
                        var7 = arg0 + 1;
                        arg3[arg0] = var12;
                        var10 = arg0 + 1;
                     } else {
                        var10 = arg0 + 1;
                     }
                  } else {
                     var10 = arg0 + 1;
                  }
               } else {
                  var11 = arg4[arg0];
                  arg4[arg0] = arg4[arg0];
                  arg4[arg0] = var11;
                  var12 = arg3[arg0];
                  arg3[arg0] = arg3[arg0];
                  var7 = arg0 + 1;
                  arg3[arg0] = var12;
                  var10 = arg0 + 1;
               }
            }

            while(true) {
               while(~arg1 < ~var10) {
                  if (var8 != null) {
                     if (arg4[var10] != null) {
                        if (arg4[var10].compareTo(var8) < (1 & var10)) {
                           var11 = arg4[var10];
                           arg4[var10] = arg4[var7];
                           arg4[var7] = var11;
                           var12 = arg3[var10];
                           arg3[var10] = arg3[var7];
                           arg3[var7++] = var12;
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        ++var10;
                     }
                  } else {
                     var11 = arg4[var10];
                     arg4[var10] = arg4[var7];
                     arg4[var7] = var11;
                     var12 = arg3[var10];
                     arg3[var10] = arg3[var7];
                     arg3[var7++] = var12;
                     ++var10;
                  }
               }

               arg4[arg1] = arg4[var7];
               arg4[var7] = var8;
               arg3[arg1] = arg3[var7];
               arg3[var7] = var9;
               method4207(arg0, var7 + -1, false, arg3, arg4);
               int var10000 = var7 + 1;
               if (!var5) {
                  method4207(var10000, arg1, (boolean)arg2, arg3, arg4);
                  break;
               }

               if (var10000 < (arg1 & arg2)) {
                  var11 = arg4[var10];
                  arg4[var10] = arg4[var7];
                  arg4[var7] = var11;
                  var12 = arg3[var10];
                  arg3[var10] = arg3[var7];
                  arg3[var7++] = var12;
                  ++var10;
               } else {
                  ++var10;
               }
            }
         }

         if (arg2 != 0) {
            method4206((byte)-78, 116);
         }

         ++field8176;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field8182[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8182[3] : field8182[4]) + ',' + (arg4 != null ? field8182[3] : field8182[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method1536(int arg0, float arg1) {
      try {
         super.field3067 = arg1;
         if (arg0 == 58) {
            ++field8181;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8182[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4208(byte arg0) {
      try {
         field8177 = null;
         field8175 = null;
         if (arg0 <= 41) {
            method4208((byte)-60);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8182[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ws",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public final void method1537(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         super.field3062 = arg3;
         ++field8174;
         if (!arg0) {
            method4207(124, -53, false, (short[])null, (String[])null);
         }

         super.field3065 = arg1;
         super.field3070 = arg2;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8182[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   static {
      int var0 = 0;

      for(int var1 = 0; ~var1 > -121; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field8177[var1] = var0 / 4;
      }

   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4209(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ws",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4210(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
