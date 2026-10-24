package deob;

@ObfuscatedName("CAMRNFMB")
public class CAMRNFMB {

	@ObfuscatedName("CAMRNFMB.f")
	public int field115 = 0;

	@ObfuscatedName("CAMRNFMB.g")
	public int field116 = 0;

	@ObfuscatedName("CAMRNFMB.h")
	public int field117;

	@ObfuscatedName("CAMRNFMB.i")
	public int field118;

	@ObfuscatedName("CAMRNFMB.j")
	public int[][] field119;

	public CAMRNFMB(int arg0, int arg1) {
		field117 = arg0;
		field118 = arg1;
		field119 = new int[field117][field118];
		method28();
	}

	@ObfuscatedName("CAMRNFMB.a()V")
	public void method28() {
		for (int var1 = 0; var1 < field117; var1++) {
			for (int var2 = 0; var2 < field118; var2++) {
				if (var1 == 0 || var2 == 0 || field117 - 1 == var1 || field118 - 1 == var2) {
					field119[var1][var2] = 0xFFFFFF;
				} else {
					field119[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("CAMRNFMB.a(IIIIZI)V")
	public void method29(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg0 -= field115;
		arg1 -= field116;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method32(arg0, arg1, 128);
				method32(arg0 - 1, arg1, 8);
			}

			if (arg4 == 1) {
				method32(arg0, arg1, 2);
				method32(arg0, arg1 + 1, 32);
			}

			if (arg4 == 2) {
				method32(arg0, arg1, 8);
				method32(arg0 + 1, arg1, 128);
			}

			if (arg4 == 3) {
				method32(arg0, arg1, 32);
				method32(arg0, arg1 - 1, 2);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method32(arg0, arg1, 1);
				method32(arg0 - 1, arg1 + 1, 16);
			}

			if (arg4 == 1) {
				method32(arg0, arg1, 4);
				method32(arg0 + 1, arg1 + 1, 64);
			}

			if (arg4 == 2) {
				method32(arg0, arg1, 16);
				method32(arg0 + 1, arg1 - 1, 1);
			}

			if (arg4 == 3) {
				method32(arg0, arg1, 64);
				method32(arg0 - 1, arg1 - 1, 4);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method32(arg0, arg1, 130);
				method32(arg0 - 1, arg1, 8);
				method32(arg0, arg1 + 1, 32);
			}

			if (arg4 == 1) {
				method32(arg0, arg1, 10);
				method32(arg0, arg1 + 1, 32);
				method32(arg0 + 1, arg1, 128);
			}

			if (arg4 == 2) {
				method32(arg0, arg1, 40);
				method32(arg0 + 1, arg1, 128);
				method32(arg0, arg1 - 1, 2);
			}

			if (arg4 == 3) {
				method32(arg0, arg1, 160);
				method32(arg0, arg1 - 1, 2);
				method32(arg0 - 1, arg1, 8);
			}
		}

		if (arg3) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method32(arg0, arg1, 0x10000);
					method32(arg0 - 1, arg1, 4096);
				}

				if (arg4 == 1) {
					method32(arg0, arg1, 1024);
					method32(arg0, arg1 + 1, 16384);
				}

				if (arg4 == 2) {
					method32(arg0, arg1, 4096);
					method32(arg0 + 1, arg1, 0x10000);
				}

				if (arg4 == 3) {
					method32(arg0, arg1, 16384);
					method32(arg0, arg1 - 1, 1024);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method32(arg0, arg1, 512);
					method32(arg0 - 1, arg1 + 1, 8192);
				}

				if (arg4 == 1) {
					method32(arg0, arg1, 2048);
					method32(arg0 + 1, arg1 + 1, 32768);
				}

				if (arg4 == 2) {
					method32(arg0, arg1, 8192);
					method32(arg0 + 1, arg1 - 1, 512);
				}

				if (arg4 == 3) {
					method32(arg0, arg1, 32768);
					method32(arg0 - 1, arg1 - 1, 2048);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method32(arg0, arg1, 66560);
					method32(arg0 - 1, arg1, 4096);
					method32(arg0, arg1 + 1, 16384);
				}

				if (arg4 == 1) {
					method32(arg0, arg1, 5120);
					method32(arg0, arg1 + 1, 16384);
					method32(arg0 + 1, arg1, 0x10000);
				}

				if (arg4 == 2) {
					method32(arg0, arg1, 20480);
					method32(arg0 + 1, arg1, 0x10000);
					method32(arg0, arg1 - 1, 1024);
				}

				if (arg4 == 3) {
					method32(arg0, arg1, 81920);
					method32(arg0, arg1 - 1, 1024);
					method32(arg0 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("CAMRNFMB.a(IZIIIII)V")
	public void method30(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg3 -= field115;
		arg2 -= field116;

		if (arg5 == 1 || arg5 == 3) {
			int var8 = arg4;
			arg4 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg3; var9 < arg3 + arg4; var9++) {
			if (var9 >= 0 && var9 < field117) {
				for (int var10 = arg2; var10 < arg0 + arg2; var10++) {
					if (var10 >= 0 && var10 < field118) {
						method32(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("CAMRNFMB.a(III)V")
	public void method31(int arg0, int arg1) {
		arg1 -= field115;
		arg0 -= field116;
		field119[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("CAMRNFMB.b(III)V")
	public void method32(int arg0, int arg1, int arg2) {
		field119[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("CAMRNFMB.a(IZIIII)V")
	public void method33(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg0 -= field115;
		arg2 -= field116;
		if (arg3 == 0) {
			if (arg4 == 0) {
				method35(128, arg0, arg2);
				method35(8, arg0 - 1, arg2);
			}

			if (arg4 == 1) {
				method35(2, arg0, arg2);
				method35(32, arg0, arg2 + 1);
			}

			if (arg4 == 2) {
				method35(8, arg0, arg2);
				method35(128, arg0 + 1, arg2);
			}

			if (arg4 == 3) {
				method35(32, arg0, arg2);
				method35(2, arg0, arg2 - 1);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg4 == 0) {
				method35(1, arg0, arg2);
				method35(16, arg0 - 1, arg2 + 1);
			}

			if (arg4 == 1) {
				method35(4, arg0, arg2);
				method35(64, arg0 + 1, arg2 + 1);
			}

			if (arg4 == 2) {
				method35(16, arg0, arg2);
				method35(1, arg0 + 1, arg2 - 1);
			}

			if (arg4 == 3) {
				method35(64, arg0, arg2);
				method35(4, arg0 - 1, arg2 - 1);
			}
		}

		if (arg3 == 2) {
			if (arg4 == 0) {
				method35(130, arg0, arg2);
				method35(8, arg0 - 1, arg2);
				method35(32, arg0, arg2 + 1);
			}

			if (arg4 == 1) {
				method35(10, arg0, arg2);
				method35(32, arg0, arg2 + 1);
				method35(128, arg0 + 1, arg2);
			}

			if (arg4 == 2) {
				method35(40, arg0, arg2);
				method35(128, arg0 + 1, arg2);
				method35(2, arg0, arg2 - 1);
			}

			if (arg4 == 3) {
				method35(160, arg0, arg2);
				method35(2, arg0, arg2 - 1);
				method35(8, arg0 - 1, arg2);
			}
		}

		if (arg1) {
			if (arg3 == 0) {
				if (arg4 == 0) {
					method35(0x10000, arg0, arg2);
					method35(4096, arg0 - 1, arg2);
				}

				if (arg4 == 1) {
					method35(1024, arg0, arg2);
					method35(16384, arg0, arg2 + 1);
				}

				if (arg4 == 2) {
					method35(4096, arg0, arg2);
					method35(0x10000, arg0 + 1, arg2);
				}

				if (arg4 == 3) {
					method35(16384, arg0, arg2);
					method35(1024, arg0, arg2 - 1);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg4 == 0) {
					method35(512, arg0, arg2);
					method35(8192, arg0 - 1, arg2 + 1);
				}

				if (arg4 == 1) {
					method35(2048, arg0, arg2);
					method35(32768, arg0 + 1, arg2 + 1);
				}

				if (arg4 == 2) {
					method35(8192, arg0, arg2);
					method35(512, arg0 + 1, arg2 - 1);
				}

				if (arg4 == 3) {
					method35(32768, arg0, arg2);
					method35(2048, arg0 - 1, arg2 - 1);
				}
			}

			if (arg3 == 2) {
				if (arg4 == 0) {
					method35(66560, arg0, arg2);
					method35(4096, arg0 - 1, arg2);
					method35(16384, arg0, arg2 + 1);
				}

				if (arg4 == 1) {
					method35(5120, arg0, arg2);
					method35(16384, arg0, arg2 + 1);
					method35(0x10000, arg0 + 1, arg2);
				}

				if (arg4 == 2) {
					method35(20480, arg0, arg2);
					method35(0x10000, arg0 + 1, arg2);
					method35(1024, arg0, arg2 - 1);
				}

				if (arg4 == 3) {
					method35(81920, arg0, arg2);
					method35(1024, arg0, arg2 - 1);
					method35(4096, arg0 - 1, arg2);
					return;
				}
			}
		}
	}

	@ObfuscatedName("CAMRNFMB.b(IZIIIII)V")
	public void method34(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg4 -= field115;
		arg5 -= field116;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg3;
			arg3 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg4; var9 < arg3 + arg4; var9++) {
			if (var9 >= 0 && var9 < field117) {
				for (int var10 = arg5; var10 < arg0 + arg5; var10++) {
					if (var10 >= 0 && var10 < field118) {
						method35(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("CAMRNFMB.a(IIII)V")
	public void method35(int arg0, int arg1, int arg2) {
		field119[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("CAMRNFMB.c(III)V")
	public void method36(int arg0, int arg1) {
		arg0 -= field115;
		arg1 -= field116;
		field119[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("CAMRNFMB.a(IIIIBII)Z")
	public boolean method37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg1 == arg3) {
			return true;
		}

		arg2 -= field115;
		arg1 -= field116;
		arg0 -= field115;
		arg3 -= field116;
		if (arg5 == 0) {
			if (arg4 == 0) {
				if (arg0 - 1 == arg2 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg1 && (field119[arg2][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg1 && (field119[arg2][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg0 == arg2 && arg3 + 1 == arg1) {
					return true;
				}

				if (arg0 - 1 == arg2 && arg1 == arg3 && (field119[arg2][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg3 && (field119[arg2][arg1] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg0 + 1 == arg2 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg1 && (field119[arg2][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg1 && (field119[arg2][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg0 == arg2 && arg3 - 1 == arg1) {
					return true;
				}

				if (arg0 - 1 == arg2 && arg1 == arg3 && (field119[arg2][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg3 && (field119[arg2][arg1] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg4 == 0) {
				if (arg0 - 1 == arg2 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg1) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg3 && (field119[arg2][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg1 && (field119[arg2][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg0 - 1 == arg2 && arg1 == arg3 && (field119[arg2][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg1) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg1 && (field119[arg2][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg0 - 1 == arg2 && arg1 == arg3 && (field119[arg2][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg1 && (field119[arg2][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg1) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg0 - 1 == arg2 && arg1 == arg3) {
					return true;
				}

				if (arg0 == arg2 && arg3 + 1 == arg1 && (field119[arg2][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 + 1 == arg2 && arg1 == arg3 && (field119[arg2][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg3 - 1 == arg1) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg0 == arg2 && arg3 + 1 == arg1 && (field119[arg2][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg3 - 1 == arg1 && (field119[arg2][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg2 && arg1 == arg3 && (field119[arg2][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg2 && arg1 == arg3 && (field119[arg2][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("CAMRNFMB.a(IIIIIII)Z")
	public boolean method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg2 == arg4) {
			return true;
		}

		arg5 -= field115;
		arg4 -= field116;
		arg1 -= field115;
		arg2 -= field116;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg1 + 1 == arg5 && arg2 == arg4 && (field119[arg5][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg4 && (field119[arg5][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg1 - 1 == arg5 && arg2 == arg4 && (field119[arg5][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg4 && (field119[arg5][arg4] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg1 - 1 == arg5 && arg2 == arg4 && (field119[arg5][arg4] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg4 && (field119[arg5][arg4] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg1 + 1 == arg5 && arg2 == arg4 && (field119[arg5][arg4] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg4 && (field119[arg5][arg4] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg1 == arg5 && arg2 + 1 == arg4 && (field119[arg5][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg2 - 1 == arg4 && (field119[arg5][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg5 && arg2 == arg4 && (field119[arg5][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg5 && arg2 == arg4 && (field119[arg5][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("CAMRNFMB.a(IIIIIIII)Z")
	public boolean method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg2 + arg4 - 1;
		int var9 = arg0 + arg1 - 1;
		if (arg6 >= arg4 && arg6 <= var8 && arg3 >= arg0 && arg3 <= var9) {
			return true;
		}

		if (arg4 - 1 == arg6 && arg3 >= arg0 && arg3 <= var9 && (field119[arg6 - field115][arg3 - field116] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg3 >= arg0 && arg3 <= var9 && (field119[arg6 - field115][arg3 - field116] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		}

		if (arg0 - 1 == arg3 && arg6 >= arg4 && arg6 <= var8 && (field119[arg6 - field115][arg3 - field116] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg3 && arg6 >= arg4 && arg6 <= var8 && (field119[arg6 - field115][arg3 - field116] & 0x20) == 0 && (arg5 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
