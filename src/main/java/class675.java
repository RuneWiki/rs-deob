import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class675 {
   @OriginalMember(
      owner = "client!sn",
      name = "r",
      descriptor = "Lhe;"
   )
   public class294 field10053 = new class294();
   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10056 = new String[]{method4986(method4985(",W&\u0011W")), method4986(method4985("$\u0017&}\u0002")), method4986(method4985(",W&\u0014W")), method4986(method4985("1Ld?")), method4986(method4985(",W&\u0010W")), method4986(method4985(",W&\u0016W")), method4986(method4985(",W&\u001eW")), method4986(method4985(",W&\u001cW")), method4986(method4985(",W&o\u00161P|mW")), method4986(method4985(",W&\u001fW")), method4986(method4985(",W&\u0015W")), method4986(method4985(",W&\u001dW")), method4986(method4985(",W&\u001bW")), method4986(method4985(",W&\u0017W")), method4986(method4985(",W&\u0019W")), method4986(method4985(",W&\u001aW")), method4986(method4985(",W&\u0018W")), method4986(method4985(",W&\u0012W"))};
   @OriginalMember(
      owner = "client!sn",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field10051 = null;
   @OriginalMember(
      owner = "client!sn",
      name = "l",
      descriptor = "Lnaa;"
   )
   public static class113 field10039 = new class113(10, 3);
   @OriginalMember(
      owner = "client!sn",
      name = "n",
      descriptor = "I"
   )
   public static int field10036;
   @OriginalMember(
      owner = "client!sn",
      name = "j",
      descriptor = "I"
   )
   public static int field10037;
   @OriginalMember(
      owner = "client!sn",
      name = "c",
      descriptor = "I"
   )
   public static int field10038;
   @OriginalMember(
      owner = "client!sn",
      name = "f",
      descriptor = "I"
   )
   public static int field10040;
   @OriginalMember(
      owner = "client!sn",
      name = "s",
      descriptor = "I"
   )
   public static int field10041;
   @OriginalMember(
      owner = "client!sn",
      name = "o",
      descriptor = "I"
   )
   public static int field10042;
   @OriginalMember(
      owner = "client!sn",
      name = "e",
      descriptor = "I"
   )
   public static int field10043;
   @OriginalMember(
      owner = "client!sn",
      name = "t",
      descriptor = "I"
   )
   public static int field10044;
   @OriginalMember(
      owner = "client!sn",
      name = "g",
      descriptor = "I"
   )
   public static int field10045;
   @OriginalMember(
      owner = "client!sn",
      name = "p",
      descriptor = "I"
   )
   public static int field10046;
   @OriginalMember(
      owner = "client!sn",
      name = "h",
      descriptor = "I"
   )
   public static int field10047;
   @OriginalMember(
      owner = "client!sn",
      name = "q",
      descriptor = "I"
   )
   public static int field10048;
   @OriginalMember(
      owner = "client!sn",
      name = "b",
      descriptor = "I"
   )
   public static int field10049;
   @OriginalMember(
      owner = "client!sn",
      name = "m",
      descriptor = "I"
   )
   public static int field10050;
   @OriginalMember(
      owner = "client!sn",
      name = "d",
      descriptor = "I"
   )
   public static int field10052;
   @OriginalMember(
      owner = "client!sn",
      name = "k",
      descriptor = "I"
   )
   public static int field10055;
   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "Lhe;"
   )
   private class294 field10054;

   @OriginalMember(
      owner = "client!sn",
      name = "c",
      descriptor = "(B)I"
   )
   public static final int method4970(byte arg0) {
      try {
         ++field10040;
         if (arg0 >= -116) {
            field10039 = null;
         }

         return class444.field6812;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10056[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4971(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field10042;
         int var3 = 0;
         class294 var4 = this.field10053.field4656;
         if (arg0 >= -97) {
            return 66;
         } else {
            while(true) {
               if (this.field10053 == var4) {
                  if (!var2) {
                     return var3;
                  }
               } else {
                  var4 = var4.field4656;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10056[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "g",
      descriptor = "(B)Lhe;"
   )
   public final class294 method4972(byte arg0) {
      try {
         if (arg0 != -84) {
            return null;
         } else {
            ++field10046;
            class294 var2 = this.field10053.field4656;
            if (this.field10053 == var2) {
               this.field10054 = null;
               return null;
            } else {
               this.field10054 = var2.field4656;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10056[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(Lhe;BLsn;)V"
   )
   private final void method4973(class294 arg0, byte arg1, class675 arg2) {
      try {
         int var4 = -14 % ((arg1 - 29) / 60);
         ++field10044;
         class294 var5 = this.field10053.field4653;
         this.field10053.field4653 = arg0.field4653;
         arg0.field4653.field4656 = this.field10053;
         if (this.field10053 != arg0) {
            arg0.field4653 = arg2.field10053.field4653;
            arg0.field4653.field4656 = arg0;
            arg2.field10053.field4653 = var5;
            var5.field4656 = arg2.field10053;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10056[15] + (arg0 != null ? field10056[1] : field10056[3]) + ',' + arg1 + ',' + (arg2 != null ? field10056[1] : field10056[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "b",
      descriptor = "(I)Lhe;"
   )
   public final class294 method4974(int arg0) {
      try {
         if (arg0 <= 80) {
            this.method4981((byte)53);
         }

         ++field10047;
         class294 var2 = this.field10053.field4656;
         if (this.field10053 == var2) {
            return null;
         } else {
            var2.method2477(1976);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10056[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(B)Lhe;"
   )
   public final class294 method4975(byte arg0) {
      try {
         if (arg0 <= 90) {
            this.method4974(25);
         }

         ++field10048;
         class294 var2 = this.field10054;
         if (this.field10053 == var2) {
            this.field10054 = null;
            return null;
         } else {
            this.field10054 = var2.field4656;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10056[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method4976(int arg0, byte arg1) {
      try {
         class129.field1853 = 1000000000L / (long)arg0;
         if (arg1 == 124) {
            ++field10041;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10056[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method4977(byte arg0) {
      try {
         if (arg0 > 103) {
            field10051 = null;
            field10039 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10056[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4978(int arg0) {
      try {
         if (arg0 != 15590) {
            this.method4975((byte)-112);
         }

         ++field10045;
         return this.field10053.field4656 == this.field10053;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10056[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "e",
      descriptor = "(B)Lhe;"
   )
   public final class294 method4979(byte arg0) {
      try {
         ++field10036;
         class294 var2 = this.field10054;
         if (this.field10053 == var2) {
            this.field10054 = null;
            return null;
         } else {
            this.field10054 = var2.field4653;
            return arg0 != -114 ? null : var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10056[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(Lhe;I)V"
   )
   public final void method4980(class294 arg0, int arg1) {
      try {
         if (arg1 != 0) {
            this.method4983(-66, (class294)null);
         }

         if (arg0.field4653 != null) {
            arg0.method2477(1976);
         }

         ++field10043;
         arg0.field4653 = this.field10053.field4653;
         arg0.field4656 = this.field10053;
         arg0.field4653.field4656 = arg0;
         arg0.field4656.field4653 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10056[13] + (arg0 != null ? field10056[1] : field10056[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method4981(byte arg0) {
      try {
         while(true) {
            class294 var2 = this.field10053.field4656;
            if (this.field10053 == var2) {
               if (arg0 > -65) {
                  method4970((byte)-28);
               }

               ++field10049;
               this.field10054 = null;
               return;
            }

            var2.method2477(1976);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10056[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(ILsn;)V"
   )
   public final void method4982(int arg0, class675 arg1) {
      try {
         int var3 = -51 / ((arg0 - 68) / 57);
         this.method4973(this.field10053.field4656, (byte)-104, arg1);
         ++field10055;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10056[5] + arg0 + ',' + (arg1 != null ? field10056[1] : field10056[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "a",
      descriptor = "(ILhe;)V"
   )
   public final void method4983(int arg0, class294 arg1) {
      try {
         if (arg0 != -17121) {
            this.method4973((class294)null, (byte)49, (class675)null);
         }

         ++field10050;
         if (arg1.field4653 != null) {
            arg1.method2477(1976);
         }

         arg1.field4656 = this.field10053.field4656;
         arg1.field4653 = this.field10053;
         arg1.field4653.field4656 = arg1;
         arg1.field4656.field4653 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10056[2] + arg0 + ',' + (arg1 != null ? field10056[1] : field10056[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "<init>",
      descriptor = "()V"
   )
   public class675() {
      try {
         this.field10053.field4656 = this.field10053;
         this.field10053.field4653 = this.field10053;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10056[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "b",
      descriptor = "(B)Lhe;"
   )
   public final class294 method4984(byte arg0) {
      try {
         ++field10038;
         if (arg0 != -69) {
            this.field10054 = null;
         }

         class294 var2 = this.field10053.field4653;
         if (this.field10053 == var2) {
            this.field10054 = null;
            return null;
         } else {
            this.field10054 = var2.field4653;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10056[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4985(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4986(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
