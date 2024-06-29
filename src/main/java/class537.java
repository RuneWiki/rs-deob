import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class537 {
   @OriginalMember(
      owner = "client!nfa",
      name = "c",
      descriptor = "I"
   )
   private int field7545;
   @OriginalMember(
      owner = "client!nfa",
      name = "n",
      descriptor = "[Lfn;"
   )
   private class96[] field7551;
   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7558 = new String[]{method4009(method4008("Q\u0017vj V\u001f~0\"\u0017")), method4009(method4008("Q\u0017vjZ\u0017")), method4009(method4008("Q\u0004{(")), method4009(method4008("D_9ja")), method4009(method4008("Q\u0017vjX\u0017")), method4009(method4008("Q\u0017vj_\u0017")), method4009(method4008("Q\u0017vjY\u0017")), method4009(method4008("Q\u0017vj]\u0017")), method4009(method4008("Q\u0017vj[\u0017")), method4009(method4008("Q\u0017vj^\u0017"))};
   @OriginalMember(
      owner = "client!nfa",
      name = "d",
      descriptor = "I"
   )
   public static int field7550 = -1;
   @OriginalMember(
      owner = "client!nfa",
      name = "e",
      descriptor = "Lhha;"
   )
   public static class724 field7549 = new class724(85, 12);
   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field7555 = null;
   @OriginalMember(
      owner = "client!nfa",
      name = "l",
      descriptor = "I"
   )
   public static int field7544;
   @OriginalMember(
      owner = "client!nfa",
      name = "g",
      descriptor = "I"
   )
   public static int field7546;
   @OriginalMember(
      owner = "client!nfa",
      name = "o",
      descriptor = "I"
   )
   public static int field7548;
   @OriginalMember(
      owner = "client!nfa",
      name = "h",
      descriptor = "I"
   )
   public static int field7552;
   @OriginalMember(
      owner = "client!nfa",
      name = "m",
      descriptor = "I"
   )
   public static int field7553;
   @OriginalMember(
      owner = "client!nfa",
      name = "i",
      descriptor = "I"
   )
   public static int field7557;
   @OriginalMember(
      owner = "client!nfa",
      name = "k",
      descriptor = "J"
   )
   private long field7556;
   @OriginalMember(
      owner = "client!nfa",
      name = "b",
      descriptor = "Lwm;"
   )
   public static class440 field7543;
   @OriginalMember(
      owner = "client!nfa",
      name = "f",
      descriptor = "Lfn;"
   )
   private class96 field7547;
   @OriginalMember(
      owner = "client!nfa",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field7554;

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(B)Lfn;"
   )
   public final class96 method4001(byte arg0) {
      boolean var2 = client.field10022;

      try {
         ++field7553;
         if (this.field7547 == null) {
            return null;
         } else if (arg0 <= 57) {
            return null;
         } else {
            class96 var3 = this.field7551[(int)(this.field7556 & (long)(this.field7545 + -1))];
            class96 var4;
            if (var2) {
               if (~this.field7547.field1548 == ~this.field7556) {
                  var4 = this.field7547;
                  this.field7547 = this.field7547.field1553;
                  return var4;
               }

               this.field7547 = this.field7547.field1553;
            }

            while(true) {
               while(this.field7547 != var3) {
                  if (~this.field7547.field1548 == ~this.field7556) {
                     var4 = this.field7547;
                     this.field7547 = this.field7547.field1553;
                     return var4;
                  }

                  this.field7547 = this.field7547.field1553;
               }

               this.field7547 = null;
               if (!var2) {
                  return null;
               }

               this.field7547 = this.field7547.field1553;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7558[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(Lfn;JB)V"
   )
   public final void method4002(class96 arg0, long arg1, byte arg2) {
      try {
         if (arg0.field1547 != null) {
            arg0.method962(false);
         }

         ++field7546;
         class96 var5 = this.field7551[(int)((long)(this.field7545 + -1) & arg1)];
         arg0.field1547 = var5.field1547;
         arg0.field1553 = var5;
         if (arg2 >= -5) {
            method4003(-109, (byte)124, 6, 37, -40, 76, -10, -59, (class17)null, 25, -15, (class211)null);
         }

         arg0.field1547.field1553 = arg0;
         arg0.field1548 = arg1;
         arg0.field1553.field1547 = arg0;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field7558[7] + (arg0 != null ? field7558[3] : field7558[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(IBIIIIIILha;IILjq;)V"
   )
   public static final void method4003(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class17 arg8, int arg9, int arg10, class211 arg11) {
      try {
         ++field7544;
         if (arg9 < arg4 && ~arg4 > ~(arg9 + arg10) && arg0 > arg3 + -13 && ~(arg3 + 3) < ~arg0) {
            arg7 = arg2;
         }

         String var12 = class259.method2224(arg11, 8);
         if (arg1 != -73) {
            field7555 = null;
         }

         class437.field6409.method1874(var12, 0, class72.field1169, arg9 + 3, class134.field2183, arg3, 215, arg7);
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field7558[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field7558[3] : field7558[2]) + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field7558[3] : field7558[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(JZ)Lfn;"
   )
   public final class96 method4004(long arg0, boolean arg1) {
      boolean var4 = client.field10022;

      try {
         ++field7557;
         this.field7556 = arg0;
         class96 var5 = this.field7551[(int)((long)(this.field7545 + -1) & arg0)];
         this.field7547 = var5.field1553;
         class96 var6;
         if (arg1) {
            field7554 = null;
            if (var4) {
               if (this.field7547.field1548 == arg0) {
                  var6 = this.field7547;
                  this.field7547 = this.field7547.field1553;
                  return var6;
               }

               this.field7547 = this.field7547.field1553;
            }
         }

         while(true) {
            while(this.field7547 != var5) {
               if (this.field7547.field1548 == arg0) {
                  var6 = this.field7547;
                  this.field7547 = this.field7547.field1553;
                  return var6;
               }

               this.field7547 = this.field7547.field1553;
            }

            this.field7547 = null;
            if (!var4) {
               return null;
            }

            this.field7547 = this.field7547.field1553;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7558[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4005(int arg0) {
      try {
         field7543 = null;
         field7554 = null;
         if (arg0 != -1) {
            method4005(-99);
         }

         field7549 = null;
         field7555 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7558[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(Lbt;B)V"
   )
   public static final void method4006(class395 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4007(int arg0, int arg1, int arg2) {
      try {
         ++field7552;
         int var3 = -106 % ((arg0 - 47) / 43);
         return (arg1 & 393216) != 0 | class118.method1145(arg2, -124, arg1) || class23.method303((byte)-103, arg2, arg1);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7558[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class537(int arg0) {
      try {
         this.field7545 = arg0;
         this.field7551 = new class96[arg0];

         for(int var2 = 0; ~arg0 < ~var2; ++var2) {
            class96 var3 = this.field7551[var2] = new class96();
            var3.field1553 = var3;
            var3.field1547 = var3;
         }

      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7558[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4008(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4009(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
