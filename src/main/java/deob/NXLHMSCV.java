package deob;

@ObfuscatedName("NXLHMSCV")
public class NXLHMSCV {

	@ObfuscatedName("NXLHMSCV.g")
	public int field1017 = 0;

	@ObfuscatedName("NXLHMSCV.h")
	public int field1018 = 0;

	@ObfuscatedName("NXLHMSCV.i")
	public int field1019;

	@ObfuscatedName("NXLHMSCV.j")
	public int field1020;

	@ObfuscatedName("NXLHMSCV.k")
	public int[][] field1021;

	public NXLHMSCV(int arg0, int arg1) {
		field1019 = arg1;
		field1020 = arg0;
		field1021 = new int[field1019][field1020];
		method354();
	}

	@ObfuscatedName("NXLHMSCV.a()V")
	public void method354() {
		for (int var1 = 0; var1 < field1019; var1++) {
			for (int var2 = 0; var2 < field1020; var2++) {
				if (var1 == 0 || var2 == 0 || field1019 - 1 == var1 || field1020 - 1 == var2) {
					field1021[var1][var2] = 0xFFFFFF;
				} else {
					field1021[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("NXLHMSCV.a(IIIIZI)V")
	public void method355(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
		arg1 -= field1017;
		arg2 -= field1018;
		if (arg0 == 0) {
			if (arg3 == 0) {
				method358(arg1, arg2, 128);
				method358(arg1 - 1, arg2, 8);
			}

			if (arg3 == 1) {
				method358(arg1, arg2, 2);
				method358(arg1, arg2 + 1, 32);
			}

			if (arg3 == 2) {
				method358(arg1, arg2, 8);
				method358(arg1 + 1, arg2, 128);
			}

			if (arg3 == 3) {
				method358(arg1, arg2, 32);
				method358(arg1, arg2 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				method358(arg1, arg2, 1);
				method358(arg1 - 1, arg2 + 1, 16);
			}

			if (arg3 == 1) {
				method358(arg1, arg2, 4);
				method358(arg1 + 1, arg2 + 1, 64);
			}

			if (arg3 == 2) {
				method358(arg1, arg2, 16);
				method358(arg1 + 1, arg2 - 1, 1);
			}

			if (arg3 == 3) {
				method358(arg1, arg2, 64);
				method358(arg1 - 1, arg2 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg3 == 0) {
				method358(arg1, arg2, 130);
				method358(arg1 - 1, arg2, 8);
				method358(arg1, arg2 + 1, 32);
			}

			if (arg3 == 1) {
				method358(arg1, arg2, 10);
				method358(arg1, arg2 + 1, 32);
				method358(arg1 + 1, arg2, 128);
			}

			if (arg3 == 2) {
				method358(arg1, arg2, 40);
				method358(arg1 + 1, arg2, 128);
				method358(arg1, arg2 - 1, 2);
			}

			if (arg3 == 3) {
				method358(arg1, arg2, 160);
				method358(arg1, arg2 - 1, 2);
				method358(arg1 - 1, arg2, 8);
			}
		}

		if (arg4) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					method358(arg1, arg2, 0x10000);
					method358(arg1 - 1, arg2, 4096);
				}

				if (arg3 == 1) {
					method358(arg1, arg2, 1024);
					method358(arg1, arg2 + 1, 16384);
				}

				if (arg3 == 2) {
					method358(arg1, arg2, 4096);
					method358(arg1 + 1, arg2, 0x10000);
				}

				if (arg3 == 3) {
					method358(arg1, arg2, 16384);
					method358(arg1, arg2 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					method358(arg1, arg2, 512);
					method358(arg1 - 1, arg2 + 1, 8192);
				}

				if (arg3 == 1) {
					method358(arg1, arg2, 2048);
					method358(arg1 + 1, arg2 + 1, 32768);
				}

				if (arg3 == 2) {
					method358(arg1, arg2, 8192);
					method358(arg1 + 1, arg2 - 1, 512);
				}

				if (arg3 == 3) {
					method358(arg1, arg2, 32768);
					method358(arg1 - 1, arg2 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg3 == 0) {
					method358(arg1, arg2, 66560);
					method358(arg1 - 1, arg2, 4096);
					method358(arg1, arg2 + 1, 16384);
				}

				if (arg3 == 1) {
					method358(arg1, arg2, 5120);
					method358(arg1, arg2 + 1, 16384);
					method358(arg1 + 1, arg2, 0x10000);
				}

				if (arg3 == 2) {
					method358(arg1, arg2, 20480);
					method358(arg1 + 1, arg2, 0x10000);
					method358(arg1, arg2 - 1, 1024);
				}

				if (arg3 == 3) {
					method358(arg1, arg2, 81920);
					method358(arg1, arg2 - 1, 1024);
					method358(arg1 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("NXLHMSCV.a(IIIIIIZ)V")
	public void method356(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg4 -= field1017;
		arg3 -= field1018;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg2;
			arg2 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg4; var9 < arg2 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1019) {
				for (int var10 = arg3; var10 < arg0 + arg3; var10++) {
					if (var10 >= 0 && var10 < field1020) {
						method358(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("NXLHMSCV.a(III)V")
	public void method357(int arg0, int arg1) {
		arg0 -= field1017;
		arg1 -= field1018;
		field1021[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("NXLHMSCV.b(III)V")
	public void method358(int arg0, int arg1, int arg2) {
		field1021[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("NXLHMSCV.a(IZIZII)V")
	public void method359(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg1 -= field1017;
		arg4 -= field1018;
		if (arg0 == 0) {
			if (arg3 == 0) {
				method361(arg4, arg1, 128);
				method361(arg4, arg1 - 1, 8);
			}

			if (arg3 == 1) {
				method361(arg4, arg1, 2);
				method361(arg4 + 1, arg1, 32);
			}

			if (arg3 == 2) {
				method361(arg4, arg1, 8);
				method361(arg4, arg1 + 1, 128);
			}

			if (arg3 == 3) {
				method361(arg4, arg1, 32);
				method361(arg4 - 1, arg1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				method361(arg4, arg1, 1);
				method361(arg4 + 1, arg1 - 1, 16);
			}

			if (arg3 == 1) {
				method361(arg4, arg1, 4);
				method361(arg4 + 1, arg1 + 1, 64);
			}

			if (arg3 == 2) {
				method361(arg4, arg1, 16);
				method361(arg4 - 1, arg1 + 1, 1);
			}

			if (arg3 == 3) {
				method361(arg4, arg1, 64);
				method361(arg4 - 1, arg1 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg3 == 0) {
				method361(arg4, arg1, 130);
				method361(arg4, arg1 - 1, 8);
				method361(arg4 + 1, arg1, 32);
			}

			if (arg3 == 1) {
				method361(arg4, arg1, 10);
				method361(arg4 + 1, arg1, 32);
				method361(arg4, arg1 + 1, 128);
			}

			if (arg3 == 2) {
				method361(arg4, arg1, 40);
				method361(arg4, arg1 + 1, 128);
				method361(arg4 - 1, arg1, 2);
			}

			if (arg3 == 3) {
				method361(arg4, arg1, 160);
				method361(arg4 - 1, arg1, 2);
				method361(arg4, arg1 - 1, 8);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					method361(arg4, arg1, 0x10000);
					method361(arg4, arg1 - 1, 4096);
				}

				if (arg3 == 1) {
					method361(arg4, arg1, 1024);
					method361(arg4 + 1, arg1, 16384);
				}

				if (arg3 == 2) {
					method361(arg4, arg1, 4096);
					method361(arg4, arg1 + 1, 0x10000);
				}

				if (arg3 == 3) {
					method361(arg4, arg1, 16384);
					method361(arg4 - 1, arg1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					method361(arg4, arg1, 512);
					method361(arg4 + 1, arg1 - 1, 8192);
				}

				if (arg3 == 1) {
					method361(arg4, arg1, 2048);
					method361(arg4 + 1, arg1 + 1, 32768);
				}

				if (arg3 == 2) {
					method361(arg4, arg1, 8192);
					method361(arg4 - 1, arg1 + 1, 512);
				}

				if (arg3 == 3) {
					method361(arg4, arg1, 32768);
					method361(arg4 - 1, arg1 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg3 == 0) {
					method361(arg4, arg1, 66560);
					method361(arg4, arg1 - 1, 4096);
					method361(arg4 + 1, arg1, 16384);
				}

				if (arg3 == 1) {
					method361(arg4, arg1, 5120);
					method361(arg4 + 1, arg1, 16384);
					method361(arg4, arg1 + 1, 0x10000);
				}

				if (arg3 == 2) {
					method361(arg4, arg1, 20480);
					method361(arg4, arg1 + 1, 0x10000);
					method361(arg4 - 1, arg1, 1024);
				}

				if (arg3 == 3) {
					method361(arg4, arg1, 81920);
					method361(arg4 - 1, arg1, 1024);
					method361(arg4, arg1 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("NXLHMSCV.a(IIIZIII)V")
	public void method360(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg5 -= field1017;
		arg1 -= field1018;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg4;
			arg4 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg5; var9 < arg4 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1019) {
				for (int var10 = arg1; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field1020) {
						method361(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("NXLHMSCV.a(IIII)V")
	public void method361(int arg0, int arg1, int arg2) {
		field1021[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("NXLHMSCV.a(IZI)V")
	public void method362(int arg0, int arg1) {
		arg1 -= field1017;
		arg0 -= field1018;
		field1021[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("NXLHMSCV.a(IIIIIII)Z")
	public boolean method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg2 == arg3) {
			return true;
		}

		arg0 -= field1017;
		arg3 -= field1018;
		arg4 -= field1017;
		arg2 -= field1018;
		if (arg1 == 0) {
			if (arg5 == 0) {
				if (arg4 - 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3 && (field1021[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3 && (field1021[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg0 == arg4 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg0 && arg2 == arg3 && (field1021[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg2 == arg3 && (field1021[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg4 + 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3 && (field1021[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3 && (field1021[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg0 == arg4 && arg2 - 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg0 && arg2 == arg3 && (field1021[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg2 == arg3 && (field1021[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg1 == 2) {
			if (arg5 == 0) {
				if (arg4 - 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg2 == arg3 && (field1021[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3 && (field1021[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg4 - 1 == arg0 && arg2 == arg3 && (field1021[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3 && (field1021[arg0][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg4 - 1 == arg0 && arg2 == arg3 && (field1021[arg0][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3 && (field1021[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg4 - 1 == arg0 && arg2 == arg3) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg3 && (field1021[arg0][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg0 && arg2 == arg3 && (field1021[arg0][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg1 == 9) {
			if (arg0 == arg4 && arg2 + 1 == arg3 && (field1021[arg0][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg2 - 1 == arg3 && (field1021[arg0][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg0 && arg2 == arg3 && (field1021[arg0][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg0 && arg2 == arg3 && (field1021[arg0][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("NXLHMSCV.b(IIIIIII)Z")
	public boolean method364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg2 == arg3) {
			return true;
		}

		arg1 -= field1017;
		arg2 -= field1018;
		arg5 -= field1017;
		arg3 -= field1018;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg0 = arg0 + 2 & 0x3;
			}

			if (arg0 == 0) {
				if (arg5 + 1 == arg1 && arg2 == arg3 && (field1021[arg1][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2 && (field1021[arg1][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg5 - 1 == arg1 && arg2 == arg3 && (field1021[arg1][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2 && (field1021[arg1][arg2] & 0x2) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg5 - 1 == arg1 && arg2 == arg3 && (field1021[arg1][arg2] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2 && (field1021[arg1][arg2] & 0x20) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg5 + 1 == arg1 && arg2 == arg3 && (field1021[arg1][arg2] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2 && (field1021[arg1][arg2] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg1 == arg5 && arg3 + 1 == arg2 && (field1021[arg1][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg3 - 1 == arg2 && (field1021[arg1][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg5 - 1 == arg1 && arg2 == arg3 && (field1021[arg1][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg5 + 1 == arg1 && arg2 == arg3 && (field1021[arg1][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("NXLHMSCV.a(IIIIIZII)Z")
	public boolean method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg2 - 1;
		int var9 = arg1 + arg6 - 1;
		if (arg5 >= arg0 && arg5 <= var8 && arg4 >= arg1 && arg4 <= var9) {
			return true;
		}

		if (arg0 - 1 == arg5 && arg4 >= arg1 && arg4 <= var9 && (field1021[arg5 - field1017][arg4 - field1018] & 0x8) == 0 && (arg3 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg5 && arg4 >= arg1 && arg4 <= var9 && (field1021[arg5 - field1017][arg4 - field1018] & 0x80) == 0 && (arg3 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg4 && arg5 >= arg0 && arg5 <= var8 && (field1021[arg5 - field1017][arg4 - field1018] & 0x2) == 0 && (arg3 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg5 >= arg0 && arg5 <= var8 && (field1021[arg5 - field1017][arg4 - field1018] & 0x20) == 0 && (arg3 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
