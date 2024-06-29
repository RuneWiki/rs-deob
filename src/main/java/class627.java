import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class class627 extends class731 {
   @OriginalMember(
      owner = "client!gl",
      name = "H",
      descriptor = "S"
   )
   public short field9212;
   @OriginalMember(
      owner = "client!gl",
      name = "J",
      descriptor = "Z"
   )
   public boolean field9210;
   @OriginalMember(
      owner = "client!gl",
      name = "D",
      descriptor = "S"
   )
   public short field9208;
   @OriginalMember(
      owner = "client!gl",
      name = "G",
      descriptor = "S"
   )
   public short field9207;
   @OriginalMember(
      owner = "client!gl",
      name = "L",
      descriptor = "S"
   )
   public short field9211;
   @OriginalMember(
      owner = "client!gl",
      name = "C",
      descriptor = "B"
   )
   public byte field9206;
   @OriginalMember(
      owner = "client!gl",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9217 = new String[]{method4553(method4552("=m<cM")), method4553(method4552("4t~I")), method4553(method4552("!/<\u000b\u0018")), method4553(method4552("=m<`M")), method4553(method4552("=m<fM")), method4553(method4552("=m<aM")), method4553(method4552("=m<dM")), method4553(method4552("=m<gM")), method4553(method4552("=m<bM")), method4553(method4552("=m<\u0019\f4hf\u001bM"))};
   @OriginalMember(
      owner = "client!gl",
      name = "B",
      descriptor = "Lek;"
   )
   public static class536 field9215 = new class536(57, -1);
   @OriginalMember(
      owner = "client!gl",
      name = "K",
      descriptor = "Lll;"
   )
   public static class387 field9216 = new class387();
   @OriginalMember(
      owner = "client!gl",
      name = "I",
      descriptor = "I"
   )
   public static int field9203;
   @OriginalMember(
      owner = "client!gl",
      name = "E",
      descriptor = "I"
   )
   public static int field9204;
   @OriginalMember(
      owner = "client!gl",
      name = "A",
      descriptor = "I"
   )
   public static int field9205;
   @OriginalMember(
      owner = "client!gl",
      name = "F",
      descriptor = "I"
   )
   public static int field9209;
   @OriginalMember(
      owner = "client!gl",
      name = "N",
      descriptor = "I"
   )
   public static int field9213;
   @OriginalMember(
      owner = "client!gl",
      name = "O",
      descriptor = "I"
   )
   public static int field9214;

   @OriginalMember(
      owner = "client!gl",
      name = "g",
      descriptor = "(I)V"
   )
   public void method2117(int arg0) {
      try {
         if (arg0 > -126) {
            field9216 = null;
         }

         ++field9214;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9217[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "i",
      descriptor = "(B)Z"
   )
   public final boolean method1764(byte arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0 != -78) {
            return false;
         } else {
            ++field9204;
            int var3 = this.field9207;
            short var10000;
            if (var2) {
               var10000 = this.field9208;
            } else if (~var3 < ~this.field9211) {
               var10000 = 0;
               if (!var2) {
                  return false;
               }
            } else {
               var10000 = this.field9208;
            }

            while(true) {
               int var4 = var10000;
               if (var2 || this.field9212 >= var4) {
                  do {
                     int var5 = class106.field1335 + var3 + -class712.field10385;
                     if (~var5 <= -1) {
                        if (~var5 <= ~class506.field7334.length && !var2) {
                           ++var4;
                        } else {
                           int var6 = class106.field1335 + var4 + -class377.field5453;
                           if (var6 >= 0) {
                              if (~var6 <= ~class506.field7334.length) {
                                 if (var2) {
                                    if (class506.field7334[var5][var6]) {
                                       return true;
                                    }

                                    ++var4;
                                 } else {
                                    ++var4;
                                 }
                              } else {
                                 if (class506.field7334[var5][var6]) {
                                    return true;
                                 }

                                 ++var4;
                              }
                           } else {
                              ++var4;
                           }
                        }
                     } else {
                        ++var4;
                     }
                  } while(this.field9212 >= var4);
               }

               ++var3;
               if (~var3 < ~this.field9211) {
                  var10000 = 0;
                  if (!var2) {
                     return false;
                  }
               } else {
                  var10000 = this.field9208;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field9217[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(ZLha;)Z"
   )
   public final boolean method1762(boolean arg0, class66 arg1) {
      try {
         if (arg0) {
            this.method2117(20);
         }

         ++field9209;
         return class505.method3662(this.field9207, this.field9211, (byte)-13, super.field10702, this.field9208, this.method244(arg1, 92160000), this.field9212);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9217[3] + arg0 + ',' + (arg1 != null ? field9217[2] : field9217[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method4549(int arg0) {
      try {
         field9216 = null;
         field9215 = null;
         if (arg0 != 16) {
            method4549(2);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9217[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "<init>",
      descriptor = "(IIIIIIIIIZB)V"
   )
   public class627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
      try {
         super.field10694 = arg2;
         super.field10697 = arg3;
         this.field9212 = (short)arg8;
         this.field9210 = arg9;
         super.field10693 = arg4;
         this.field9208 = (short)arg7;
         this.field9207 = (short)arg5;
         this.field9211 = (short)arg6;
         super.field10702 = (byte)arg1;
         super.field10701 = (byte)arg0;
         this.field9206 = arg10;
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field9217[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "([Lmn;Z)I"
   )
   public final int method1763(class389[] param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gl",
      name = "j",
      descriptor = "(B)V"
   )
   public static final void method4550(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method4551(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 <= 126) {
            field9216 = null;
         }

         ++field9205;
         return (arg2 & 2048) != 0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9217[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4552(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4553(char[] arg0) {
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
            var10005 = 1;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
