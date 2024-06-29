import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class191 extends class297 {
   @OriginalMember(
      owner = "client!es",
      name = "J",
      descriptor = "I"
   )
   public int field2966 = 0;
   @OriginalMember(
      owner = "client!es",
      name = "I",
      descriptor = "I"
   )
   public int field2970 = 12800;
   @OriginalMember(
      owner = "client!es",
      name = "H",
      descriptor = "Z"
   )
   public boolean field2980 = true;
   @OriginalMember(
      owner = "client!es",
      name = "G",
      descriptor = "I"
   )
   public int field2982 = -1;
   @OriginalMember(
      owner = "client!es",
      name = "L",
      descriptor = "I"
   )
   public int field2967 = 12800;
   @OriginalMember(
      owner = "client!es",
      name = "y",
      descriptor = "I"
   )
   public int field2972 = 0;
   @OriginalMember(
      owner = "client!es",
      name = "B",
      descriptor = "I"
   )
   public int field2985 = -1;
   @OriginalMember(
      owner = "client!es",
      name = "Q",
      descriptor = "I"
   )
   public int field2973;
   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   public String field2965;
   @OriginalMember(
      owner = "client!es",
      name = "D",
      descriptor = "Ljava/lang/String;"
   )
   public String field2983;
   @OriginalMember(
      owner = "client!es",
      name = "w",
      descriptor = "I"
   )
   public int field2981;
   @OriginalMember(
      owner = "client!es",
      name = "M",
      descriptor = "Lsn;"
   )
   public class675 field2975;
   @OriginalMember(
      owner = "client!es",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2986 = new String[]{method1707(method1706(">D5\u001aQ")), method1707(method1706(" \u00195s\u0004")), method1707(method1706("5Bw1")), method1707(method1706(">D5\u0019Q")), method1707(method1706(">D5\u001fQ")), method1707(method1706(">D5\u001eQ")), method1707(method1706(">D5a\u00105^ocQ")), method1707(method1706(">D5\u001cQ")), method1707(method1706(">D5\u001bQ")), method1707(method1706(">D5\u0015Q")), method1707(method1706(">D5\u0018Q"))};
   @OriginalMember(
      owner = "client!es",
      name = "C",
      descriptor = "I"
   )
   public static int field2964;
   @OriginalMember(
      owner = "client!es",
      name = "E",
      descriptor = "I"
   )
   public static int field2969;
   @OriginalMember(
      owner = "client!es",
      name = "F",
      descriptor = "I"
   )
   public static int field2971;
   @OriginalMember(
      owner = "client!es",
      name = "O",
      descriptor = "I"
   )
   public static int field2974;
   @OriginalMember(
      owner = "client!es",
      name = "x",
      descriptor = "I"
   )
   public static int field2977;
   @OriginalMember(
      owner = "client!es",
      name = "A",
      descriptor = "I"
   )
   public static int field2979;
   @OriginalMember(
      owner = "client!es",
      name = "u",
      descriptor = "I"
   )
   public static int field2984;
   @OriginalMember(
      owner = "client!es",
      name = "P",
      descriptor = "[Lkk;"
   )
   public static class63[] field2976;
   @OriginalMember(
      owner = "client!es",
      name = "v",
      descriptor = "[S"
   )
   public static short[] field2978;
   @OriginalMember(
      owner = "client!es",
      name = "N",
      descriptor = "[[B"
   )
   public static byte[][] field2968;

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(BIII[I)Z",
      line = 3
   )
   public final boolean method1698(byte arg0, int arg1, int arg2, int arg3, int[] arg4) {
      boolean var6 = client.field1786;

      try {
         ++field2977;
         class724 var7 = (class724)this.field2975.method4972((byte)-84);
         if (var6) {
            if (var7.method5349(arg2, arg1, 105, arg3)) {
               var7.method5355(true, arg2, arg4, arg1);
               return true;
            }

            var7 = (class724)this.field2975.method4975((byte)109);
         }

         while(true) {
            boolean var10000;
            if (var7 == null) {
               int var8 = 68 % ((arg0 - -51) / 53);
               var10000 = false;
               if (!var6) {
                  return false;
               }
            } else {
               var10000 = var7.method5349(arg2, arg1, 105, arg3);
            }

            if (var10000) {
               var7.method5355(true, arg2, arg4, arg1);
               return true;
            }

            var7 = (class724)this.field2975.method4975((byte)109);
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field2986[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2986[1] : field2986[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(Z)V",
      line = 27
   )
   public final void method1699(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "([IIII)Z",
      line = 62
   )
   public final boolean method1700(int[] arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         ++field2984;
         class724 var6 = (class724)this.field2975.method4972((byte)-84);
         if (var5) {
            if (var6.method5352(arg1, arg2 + -103, arg3)) {
               var6.method5355(true, arg3, arg0, arg1);
               return true;
            }

            var6 = (class724)this.field2975.method4975((byte)109);
         }

         while(true) {
            int var10000;
            if (var6 == null) {
               var10000 = arg2;
               if (!var5) {
                  if (arg2 != 0) {
                     field2968 = null;
                  }

                  return false;
               }
            } else {
               var10000 = var6.method5352(arg1, arg2 + -103, arg3);
            }

            if (var10000 != 0) {
               var6.method5355(true, arg3, arg0, arg1);
               return true;
            }

            var6 = (class724)this.field2975.method4975((byte)109);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2986[3] + (arg0 != null ? field2986[1] : field2986[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "g",
      descriptor = "(I)V",
      line = 90
   )
   public static final void method1701(int arg0) {
      try {
         ++field2969;
         if (class159.field2363 != 0) {
            try {
               if (~(++class425.field6575) < -2001) {
                  label68: {
                     class510.field7800.method204((byte)127);
                     if (~class18.field238 > -3) {
                        class663.field9937.method4136(43594);
                        class159.field2363 = 1;
                        class425.field6575 = 0;
                        ++class18.field238;
                        if (!client.field1786) {
                           break label68;
                        }
                     }

                     class159.field2363 = 0;
                     class56.field693 = -5;
                     return;
                  }
               }

               if (~class159.field2363 == -2) {
                  class510.field7800.field346 = class663.field9937.method4137(arg0 + 24563, class498.field7578);
                  class159.field2363 = 2;
               }

               if (arg0 != -24120) {
                  field2978 = null;
               }

               if (~class159.field2363 == -3) {
                  if (class510.field7800.field346.field4398 == 2) {
                     throw new IOException();
                  }

                  if (class510.field7800.field346.field4398 != 1) {
                     return;
                  }

                  class510.field7800.field355 = class240.method2042(15000, (Socket)class510.field7800.field346.field4401, arg0 + 22277);
                  class510.field7800.field346 = null;
                  class510.field7800.method210(12765);
                  class159.field2363 = 4;
               }

               if (class159.field2363 == 4) {
                  if (class510.field7800.field355.method1583(1, arg0 + 24026)) {
                     class510.field7800.field355.method1584(1, class510.field7800.field362.field5428, 0, 29439);
                     int var1 = class510.field7800.field362.field5428[0] & 255;
                     class159.field2363 = 0;
                     class56.field693 = var1;
                     class510.field7800.method204((byte)122);
                  }
               }
            } catch (IOException var3) {
               class510.field7800.method204((byte)115);
               if (class18.field238 < 2) {
                  class663.field9937.method4136(43594);
                  class159.field2363 = 1;
                  ++class18.field238;
                  class425.field6575 = 0;
               } else {
                  class159.field2363 = 0;
                  class56.field693 = -4;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2986[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "<init>",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V",
      line = 303
   )
   public class191(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
      try {
         this.field2973 = arg3;
         this.field2982 = arg6;
         this.field2965 = arg1;
         this.field2985 = arg4;
         this.field2983 = arg2;
         this.field2980 = arg5;
         this.field2981 = arg0;
         if (~this.field2982 == -256) {
            this.field2982 = 0;
         }

         this.field2975 = new class675();
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field2986[6] + arg0 + ',' + (arg1 != null ? field2986[1] : field2986[2]) + ',' + (arg2 != null ? field2986[1] : field2986[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(III)Z",
      line = 198
   )
   public final boolean method1702(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         ++field2974;
         class724 var5 = (class724)this.field2975.method4972((byte)-84);
         if (var4) {
            if (var5.method5352(arg1, -113, arg0)) {
               return true;
            }

            var5 = (class724)this.field2975.method4975((byte)111);
         }

         while(true) {
            int var10000;
            if (var5 == null) {
               var10000 = arg2;
               if (!var4) {
                  if (arg2 != 4) {
                     this.field2965 = null;
                  }

                  return false;
               }
            } else {
               var10000 = var5.method5352(arg1, -113, arg0);
            }

            if (var10000 != 0) {
               return true;
            }

            var5 = (class724)this.field2975.method4975((byte)111);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2986[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(BI[II)Z",
      line = 223
   )
   public final boolean method1703(byte arg0, int arg1, int[] arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         ++field2964;
         class724 var6 = (class724)this.field2975.method4972((byte)-84);
         if (var5) {
            if (var6.method5351(arg1, 65, arg3)) {
               var6.method5353(-96, arg1, arg2, arg3);
               return true;
            }

            var6 = (class724)this.field2975.method4975((byte)107);
         }

         while(true) {
            byte var10000;
            if (var6 == null) {
               var10000 = arg0;
               if (!var5) {
                  if (arg0 < 89) {
                     return true;
                  }

                  return false;
               }
            } else {
               var10000 = var6.method5351(arg1, 65, arg3);
            }

            if (var10000 != 0) {
               var6.method5353(-96, arg1, arg2, arg3);
               return true;
            }

            var6 = (class724)this.field2975.method4975((byte)107);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2986[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2986[1] : field2986[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "c",
      descriptor = "(I)V",
      line = 252
   )
   public static void method1704(int arg0) {
      try {
         int var1 = 61 / ((-29 - arg0) / 32);
         field2978 = null;
         field2976 = null;
         field2968 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2986[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "h",
      descriptor = "(I)V",
      line = 279
   )
   public static final void method1705(int arg0) {
      try {
         class304 var1 = class594.field8740;
         synchronized(class594.field8740) {
            class594.field8740.method2551(true);
         }

         if (arg0 > -21) {
            method1704(-115);
         }

         ++field2971;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2986[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1706(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1707(char[] arg0) {
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
            var10005 = 55;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
