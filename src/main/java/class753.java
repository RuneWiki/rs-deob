import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class753 extends class76 {
   @OriginalMember(
      owner = "client!hn",
      name = "R",
      descriptor = "I"
   )
   public int field11136 = 12800;
   @OriginalMember(
      owner = "client!hn",
      name = "J",
      descriptor = "Z"
   )
   public boolean field11141 = true;
   @OriginalMember(
      owner = "client!hn",
      name = "H",
      descriptor = "I"
   )
   public int field11131 = -1;
   @OriginalMember(
      owner = "client!hn",
      name = "S",
      descriptor = "I"
   )
   public int field11147 = 0;
   @OriginalMember(
      owner = "client!hn",
      name = "O",
      descriptor = "I"
   )
   public int field11142 = 12800;
   @OriginalMember(
      owner = "client!hn",
      name = "U",
      descriptor = "I"
   )
   public int field11149 = -1;
   @OriginalMember(
      owner = "client!hn",
      name = "N",
      descriptor = "I"
   )
   public int field11150 = 0;
   @OriginalMember(
      owner = "client!hn",
      name = "E",
      descriptor = "Ljava/lang/String;"
   )
   public String field11143;
   @OriginalMember(
      owner = "client!hn",
      name = "L",
      descriptor = "I"
   )
   public int field11148;
   @OriginalMember(
      owner = "client!hn",
      name = "Q",
      descriptor = "I"
   )
   public int field11138;
   @OriginalMember(
      owner = "client!hn",
      name = "T",
      descriptor = "Ljava/lang/String;"
   )
   public String field11137;
   @OriginalMember(
      owner = "client!hn",
      name = "I",
      descriptor = "Lll;"
   )
   public class387 field11132;
   @OriginalMember(
      owner = "client!hn",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11153 = new String[]{method5469(method5468("\u001beEy")), method5469(method5468("\u000e>\u0007;.")), method5469(method5468("\u001d~\u0007S{")), method5469(method5468("\u001d~\u0007R{")), method5469(method5468("\u001d~\u0007W{")), method5469(method5468("\u001d~\u0007V{")), method5469(method5468("\u001d~\u0007]{")), method5469(method5468("\u001d~\u0007T{")), method5469(method5468("\u001d~\u0007P{")), method5469(method5468("\u001d~\u0007):\u001by]+{")), method5469(method5468("\u001d~\u0007Q{"))};
   @OriginalMember(
      owner = "client!hn",
      name = "M",
      descriptor = "I"
   )
   public static int field11133 = 0;
   @OriginalMember(
      owner = "client!hn",
      name = "D",
      descriptor = "Z"
   )
   public static boolean field11135 = false;
   @OriginalMember(
      owner = "client!hn",
      name = "C",
      descriptor = "I"
   )
   public static int field11134;
   @OriginalMember(
      owner = "client!hn",
      name = "G",
      descriptor = "I"
   )
   public static int field11139;
   @OriginalMember(
      owner = "client!hn",
      name = "A",
      descriptor = "I"
   )
   public static int field11140;
   @OriginalMember(
      owner = "client!hn",
      name = "F",
      descriptor = "I"
   )
   public static int field11144;
   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "I"
   )
   public static int field11145;
   @OriginalMember(
      owner = "client!hn",
      name = "K",
      descriptor = "I"
   )
   public static int field11146;
   @OriginalMember(
      owner = "client!hn",
      name = "B",
      descriptor = "I"
   )
   public static int field11151;
   @OriginalMember(
      owner = "client!hn",
      name = "P",
      descriptor = "Lkf;"
   )
   public static class266 field11152;

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(III[II)Z"
   )
   public final boolean method5460(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
      boolean var6 = client.field4360;

      try {
         ++field11145;
         class552 var7 = (class552)this.field11132.method2933(2);
         if (arg2 != 3875) {
            this.field11136 = 47;
            if (var6) {
               if (var7.method3964(arg4, arg1, arg0, 16755)) {
                  var7.method3959(arg3, arg1, 0, arg0);
                  return true;
               }

               var7 = (class552)this.field11132.method2940(false);
            }
         }

         while(true) {
            boolean var10000;
            if (var7 == null) {
               var10000 = false;
               if (!var6) {
                  return false;
               }
            } else {
               var10000 = var7.method3964(arg4, arg1, arg0, 16755);
            }

            if (var10000) {
               var7.method3959(arg3, arg1, 0, arg0);
               return true;
            }

            var7 = (class552)this.field11132.method2940(false);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field11153[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11153[1] : field11153[0]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(ZII)Z"
   )
   public static final boolean method5461(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            method5465(127, -121, (byte)-27, -126, 121);
         }

         ++field11134;
         return ~(33 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11153[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "([IZII)Z"
   )
   public final boolean method5462(int[] arg0, boolean arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         ++field11139;
         class552 var6 = (class552)this.field11132.method2933(2);
         if (var5) {
            if (var6.method3960((byte)6, arg2, arg3)) {
               var6.method3959(arg0, arg2, 0, arg3);
               return true;
            }

            var6 = (class552)this.field11132.method2940(arg1);
         }

         while(true) {
            boolean var10000;
            if (var6 == null) {
               var10000 = arg1;
               if (!var5) {
                  if (arg1) {
                     this.method5462((int[])null, false, 90, 73);
                  }

                  return false;
               }
            } else {
               var10000 = var6.method3960((byte)6, arg2, arg3);
            }

            if (var10000) {
               var6.method3959(arg0, arg2, 0, arg3);
               return true;
            }

            var6 = (class552)this.field11132.method2940(arg1);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11153[2] + (arg0 != null ? field11153[1] : field11153[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5463(int arg0) {
      boolean var2 = client.field4360;

      try {
         this.field11150 = 0;
         this.field11136 = 12800;
         ++field11144;
         this.field11142 = 12800;
         this.field11147 = 0;
         class552 var3 = (class552)this.field11132.method2933(2);
         int var10000;
         int var10001;
         if (var2) {
            var10000 = this.field11147;
            var10001 = var3.field7916;
         } else if (var3 == null) {
            var10000 = arg0;
            var10001 = -1173855007;
            if (!var2) {
               if (arg0 != -1173855007) {
                  this.method5462((int[])null, false, 31, -74);
                  return;
               }

               return;
            }
         } else {
            var10000 = this.field11147;
            var10001 = var3.field7916;
         }

         while(true) {
            if (var10000 < var10001) {
               this.field11147 = var3.field7916;
            }

            if (this.field11142 > var3.field7920) {
               this.field11142 = var3.field7920;
            }

            if (var3.field7919 > this.field11150) {
               this.field11150 = var3.field7919;
            }

            if (~var3.field7910 > ~this.field11136) {
               this.field11136 = var3.field7910;
            }

            var3 = (class552)this.field11132.method2940(false);
            if (var3 == null) {
               var10000 = arg0;
               var10001 = -1173855007;
               if (!var2) {
                  if (arg0 != -1173855007) {
                     this.method5462((int[])null, false, 31, -74);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this.field11147;
               var10001 = var3.field7916;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11153[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "([IIII)Z"
   )
   public final boolean method5464(int[] arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         ++field11140;
         if (arg3 != 0) {
            method5466((byte)-76);
         }

         class552 var6 = (class552)this.field11132.method2933(arg3 ^ 2);
         boolean var10000;
         if (var5) {
            var10000 = var6.method3963(arg2, (byte)-124, arg1);
         } else if (var6 == null) {
            var10000 = false;
            if (!var5) {
               return false;
            }
         } else {
            var10000 = var6.method3963(arg2, (byte)-124, arg1);
         }

         while(!var10000) {
            var6 = (class552)this.field11132.method2940(false);
            if (var6 == null) {
               var10000 = false;
               if (!var5) {
                  return false;
               }
            } else {
               var10000 = var6.method3963(arg2, (byte)-124, arg1);
            }
         }

         var6.method3961(arg2, arg1, true, arg0);
         return true;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11153[7] + (arg0 != null ? field11153[1] : field11153[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(IIBII)I"
   )
   public static final int method5465(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field11146;
         if (arg2 > -62) {
            method5465(-20, 98, (byte)108, -40, 102);
         }

         int var5 = 65536 - class363.field4987[arg1 * 8192 / arg0] >> 1;
         return ((-var5 + 65536) * arg3 >> 16) + (arg4 * var5 >> 16);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11153[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method5466(byte arg0) {
      try {
         int var1 = 70 / ((arg0 - 42) / 35);
         field11152 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11153[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method5467(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field11151;
         class552 var5 = (class552)this.field11132.method2933(arg2 ^ 8194);
         if (arg2 != 8192) {
            return true;
         } else {
            while(true) {
               boolean var10000;
               if (var5 == null) {
                  var10000 = false;
                  if (!var4) {
                     return false;
                  }
               } else {
                  var10000 = var5.method3960((byte)6, arg1, arg0);
               }

               if (var10000) {
                  return true;
               }

               var5 = (class552)this.field11132.method2940(false);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11153[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "<init>",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V"
   )
   public class753(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
      try {
         this.field11143 = arg1;
         this.field11149 = arg4;
         this.field11148 = arg0;
         this.field11138 = arg3;
         this.field11141 = arg5;
         this.field11131 = arg6;
         this.field11137 = arg2;
         if (this.field11131 == 255) {
            this.field11131 = 0;
         }

         this.field11132 = new class387();
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field11153[9] + arg0 + ',' + (arg1 != null ? field11153[1] : field11153[0]) + ',' + (arg2 != null ? field11153[1] : field11153[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5468(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5469(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
