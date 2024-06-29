import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class60 {
   @OriginalMember(
      owner = "client!gda",
      name = "n",
      descriptor = "I"
   )
   private int field633 = -1;
   @OriginalMember(
      owner = "client!gda",
      name = "g",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field638 = new String[0];
   @OriginalMember(
      owner = "client!gda",
      name = "d",
      descriptor = "Z"
   )
   private boolean field643 = false;
   @OriginalMember(
      owner = "client!gda",
      name = "i",
      descriptor = "I"
   )
   private int field637;
   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field644 = new String[]{method457(method456("Ymq0\b\u0016")), method457(method456("Ymq0\t\u0016")), method457(method456("P||r")), method457(method456("Ymq0\u0002\u0016")), method457(method456("E'>07")), method457(method456("\u0012)")), method457(method456("Ymq0>QZdl#Pn8")), method457(method456("Ymq0\u000b\u0016")), method457(method456("Ymq0\r\u0016")), method457(method456("Ymq0\u000e\u0016")), method457(method456("Ymq0\f\u0016")), method457(method456("Ymq0\u000f\u0016")), method457(method456("Ymq0vWgyjt\u0016"))};
   @OriginalMember(
      owner = "client!gda",
      name = "m",
      descriptor = "Ltv;"
   )
   public static class590 field642 = new class590(64);
   @OriginalMember(
      owner = "client!gda",
      name = "k",
      descriptor = "I"
   )
   public static int field630;
   @OriginalMember(
      owner = "client!gda",
      name = "c",
      descriptor = "I"
   )
   public static int field631;
   @OriginalMember(
      owner = "client!gda",
      name = "j",
      descriptor = "I"
   )
   public static int field632;
   @OriginalMember(
      owner = "client!gda",
      name = "b",
      descriptor = "I"
   )
   public static int field634;
   @OriginalMember(
      owner = "client!gda",
      name = "h",
      descriptor = "I"
   )
   public static int field635;
   @OriginalMember(
      owner = "client!gda",
      name = "f",
      descriptor = "I"
   )
   public static int field636;
   @OriginalMember(
      owner = "client!gda",
      name = "l",
      descriptor = "I"
   )
   public static int field639;
   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "I"
   )
   public static int field640;
   @OriginalMember(
      owner = "client!gda",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public static String field641;

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(II)I"
   )
   private final int method448(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field630;
         int var4 = this.field638.length;
         if (arg0 != -14883) {
            return 79;
         } else {
            while(true) {
               while(true) {
                  int var10000;
                  if (~var4 < ~arg1) {
                     var10000 = var4;
                     if (!var3) {
                        return var4;
                     }
                  } else {
                     var10000 = this.field643;
                  }

                  if (var10000 == 0) {
                     break;
                  }

                  if (~var4 == -1) {
                     var4 = 1;
                     if (!var3) {
                        continue;
                     }
                  }

                  var4 = this.field637 * var4;
                  if (var3) {
                     break;
                  }
               }

               var4 += this.field637;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field644[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      boolean var1 = client.field4273;

      try {
         ++field635;
         StringBuffer var2 = new StringBuffer();
         var2.append("[");
         int var3 = 0;
         if (var1) {
            if (var3 != 0) {
               var2.append(field644[5]);
            }

            var2.append(this.field638[var3]);
            ++var3;
         }

         while(true) {
            while(~this.field633 < ~var3) {
               if (var3 != 0) {
                  var2.append(field644[5]);
               }

               var2.append(this.field638[var3]);
               ++var3;
            }

            var2.append("]");
            if (!var1) {
               return var2.toString();
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field644[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(I)[Ljava/lang/String;"
   )
   public final String[] method449(int arg0) {
      try {
         if (arg0 != -9818) {
            field642 = null;
         }

         ++field632;
         String[] var2 = new String[this.field633 - -1];
         class714.method5193(this.field638, 0, var2, 0, this.field633 + 1);
         return var2;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field644[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(IBII)V"
   )
   public static final void method450(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field634;
         if (arg1 < -58) {
            class507 var4 = class585.field8040[arg3][arg2];
            class479.method3492(1337683308, var4 != null ? var4 : class462.field6335, arg0);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field644[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(IB)V"
   )
   private final void method451(int arg0, byte arg1) {
      try {
         if (arg1 == -39) {
            ++field631;
            String[] var3 = new String[this.method448(-14883, arg0)];
            class714.method5193(this.field638, 0, var3, 0, this.field638.length);
            this.field638 = var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field644[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(BILjava/lang/String;)V"
   )
   private final void method452(byte arg0, int arg1, String arg2) {
      try {
         ++field639;
         if (~arg1 < ~this.field633) {
            this.field633 = arg1;
         }

         if (this.field638.length <= arg1) {
            this.method451(arg1, (byte)-39);
         }

         this.field638[arg1] = arg2;
         if (arg0 > -43) {
            this.method454(0, (String)null);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field644[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field644[4] : field644[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method453(boolean arg0) {
      try {
         field642 = null;
         field641 = null;
         if (!arg0) {
            field642 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field644[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public final void method454(int arg0, String arg1) {
      try {
         ++field636;
         this.method452((byte)-96, this.field633 + 1, arg1);
         if (arg0 < 86) {
            this.method448(-22, -32);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field644[11] + arg0 + ',' + (arg1 != null ? field644[4] : field644[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(ILeb;IILha;)V"
   )
   public static final void method455(int param0, class657 param1, int param2, int param3, class65 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gda",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class60(int arg0, boolean arg1) {
      try {
         this.field643 = arg1;
         this.field637 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field644[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method456(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method457(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
